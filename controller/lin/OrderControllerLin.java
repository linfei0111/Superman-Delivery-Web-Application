package cn.kgc.controller.lin;

import cn.kgc.config.WXPayConfig;
import cn.kgc.entity.ShoppingCart;
import cn.kgc.entity.h.Order;
import cn.kgc.service.lin.MenuServiceLin;
import cn.kgc.service.lin.OrderServiceLin;
import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderControllerLin {

    @Autowired
    private MenuServiceLin menuServiceLin;

    @Autowired
    private OrderServiceLin orderServiceLin;

    @RequestMapping("/orderDetail")
    public String getOrderList(Integer[] menuId, Integer[] quantity, Double[] unitPrice, Double[] subtotal, Model model){
        List<ShoppingCart> shoppingCarts = new ArrayList<ShoppingCart>();
        double totalMoney = 0;
        for (int i = 0; i < menuId.length; i++) {
            ShoppingCart shoppingCart = new ShoppingCart(null,menuId[i], quantity[i], unitPrice[i], subtotal[i]);
            shoppingCarts.add(shoppingCart);
            totalMoney += subtotal[i];
        }
        for (ShoppingCart shoppingCart : shoppingCarts) {
            shoppingCart.setMenu(menuServiceLin.getMenu(shoppingCart.getMenuId()));
        }

        model.addAttribute("totalMoney", totalMoney);
        model.addAttribute("shoppingCarts", shoppingCarts);
        return "order";
    }

    @RequestMapping("/generateQRCode")
    @ResponseBody
    public Map<String, String> generateQRCode(String orderNo) throws Exception{
        WXPayConfig wxPayConfig = new WXPayConfig();
        WXPay wxpay = new WXPay(wxPayConfig);

        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", orderNo);
        data.put("total_fee", "1");       //设定支付金额为1分,实际情况应当调用业务方法根据订单号查询出订单金额，单位为分
        data.put("body", wxPayConfig.getBody());
        data.put("fee_type", wxPayConfig.getFeeType());
        data.put("trade_type", wxPayConfig.getTradeType());
        data.put("notify_url", wxPayConfig.getNotifyUrl());

        //将参数组织成xml格式并发送到微信服务器,同时将返回的xml结果转变成map对象
        Map<String, String> resp = wxpay.unifiedOrder(data);
        Map<String,String> map = new HashMap<>();
        map.put("codeUrl",resp.get("code_url"));

        System.out.println("json="+map);
        return map;
    }

    @RequestMapping("/receiveNotify")
    public void receiveNotify(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("==============================receiveNotify");
        // 接收微信服务器数据
        InputStream inputStream = request.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder builder = new StringBuilder("");
        String s = null;
        while((s = in.readLine()) != null){
            builder.append(s);
        }
        in.close();
        inputStream.close();
        Map<String, String> payResult = WXPayUtil.xmlToMap(builder.toString());
        System.out.println("=========="+payResult);

        //如果支付成功则修改订单状态
        String resultCode = payResult.get("result_code");
        if("SUCCESS".equals(resultCode)){
            String tradeNo = payResult.get("out_trade_no");
            //TODO  需调用业务方法修改订单标状态为"已付款",暂时用全局变量来标识
            //request.getServletContext().setAttribute("success",true);
            Order order = new Order();
            order.setStatus("已付款");
            order.setOrderNum(Long.parseLong(tradeNo));
            orderServiceLin.updateOrder(order);
        }

        //给微信服务器反馈
        Map<String, String> reply = new HashMap<>();
        reply.put("return_code", "SUCCESS");
        reply.put("return_msg", "OK");
        response.setContentType("application/xml;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(WXPayUtil.mapToXml(reply));
        out.flush();
        out.close();
    }

    @RequestMapping("/queryOrderStatus")
    @ResponseBody
    public Map<String,Boolean> queryOrderStatus(String orderNo,HttpServletRequest request){
        Map<String,Boolean> map = new HashMap<>();
        //TODO 需调用业务方法查询订单的状态，暂时根据全局变量来判断
        //Boolean success = (Boolean) request.getServletContext().getAttribute("success");
        Boolean success = orderServiceLin.getOrder(orderNo).getStatus().equals("已付款");
        map.put("success",success);
        return map;
    }
}
