package cn.kgc.controller.h;

import cn.kgc.entity.h.Comments;
import cn.kgc.entity.h.Repay;
import cn.kgc.entity.h.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.kgc.service.h.CommentsService;
import cn.kgc.service.h.OrderService;
import cn.kgc.service.h.RepayService;
import cn.kgc.service.h.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @Autowired
    private RepayService repayService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @RequestMapping("/add")
    @ResponseBody
    public Boolean addComment(Comments comment, HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        return commentsService.addComment(comment) && userService.changeKxiMoney(user.getId(),10)&& orderService.updateStatus(comment.getOid(),"已评价");
    }
    @RequestMapping("/addRepay")
    @ResponseBody
    public Boolean addRepay(Repay repay) {
        return repayService.addRepay(repay) && orderService.updateStatus(repay.getOrderId(),"已退款");
    }

}
