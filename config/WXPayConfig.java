package cn.kgc.config;

import com.github.wxpay.sdk.IWXPayDomain;

import java.io.InputStream;

/****
 * 微信的配置类
 */
public class WXPayConfig extends com.github.wxpay.sdk.WXPayConfig {

    private String appID = "wxab8acb865bb1637e";             //应用ID
    private String mchID = "11473623";                       //商户号
    private String key = "2ab9071b06b9f739b950ddb41db2690d"; //密钥
    private String notifyUrl = "http://8.138.91.26:8080/SuperManDDL/order/receiveNotify";  //接收微信服务器发出的通知,获取支付结果
    private String body = "课工场电商平台";                    //商品描述
    private String tradeType = "NATIVE";                     //交易类型
    private String feeType = "CNY";                          //货币类型

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getMchID() {
        return mchID;
    }

    public void setMchID(String mchID) {
        this.mchID = mchID;
    }

    public String getKey() {
        return key;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    //获取认证证书文件内容
    @Override
    public InputStream getCertStream() {
        return null;
    }

    //获取域名(主备切换)
    @Override
    public IWXPayDomain getWXPayDomain() {
        return WXPayDomainSimpleImpl.instance();
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }
}
