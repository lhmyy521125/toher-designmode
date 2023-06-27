package com.design.toher.facade;

public class PaymentFacade {
    private Alipay alipay;
    private WeChatPay weChatPay;
    private BankPay bankPay;

    public PaymentFacade() {
        this.alipay = new Alipay();
        this.weChatPay = new WeChatPay();
        this.bankPay = new BankPay();
    }

    public void payWithAlipay() {
        alipay.login();
        alipay.showQRCode();
        alipay.confirmPayment();
    }

    public void payWithWeChatPay() {
        weChatPay.login();
        weChatPay.showQRCode();
        weChatPay.confirmPayment();
    }

    public void payWithBankPay() {
        bankPay.login();
        bankPay.inputCardInfo();
        bankPay.confirmPayment();
    }
}
