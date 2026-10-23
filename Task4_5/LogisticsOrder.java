package Task4_5;

import java.util.Objects;


public final class LogisticsOrder {

    private final String orderNo;
    private final String sender;
    private final String receiver;
    private final boolean fragile;
    private final double insuredAmount;

    private LogisticsOrder(Builder b) {
        this.orderNo = b.orderNo;
        this.sender = b.sender;
        this.receiver = b.receiver;
        this.fragile = b.fragile;
        this.insuredAmount = b.insuredAmount;
    }

    @Override
    public String toString() {
        return "订单号[" + orderNo + "], 寄件人[" + Objects.toString(sender, "-") + "], 收件人[" + Objects.toString(receiver, "-") + "], 易碎品[" + fragile + "], 保价[" + insuredAmount + "元]";
    }

    public static class Builder {
        private final String orderNo;
        private String sender;
        private String receiver;
        private boolean fragile;
        private double insuredAmount;

        public Builder(String orderNo) {
            this.orderNo = orderNo;
        }

        public Builder sender(String sender){
            this.sender = sender;
            return this;
        }
        public Builder receiver(String receiver){
            this.receiver = receiver;
            return this;
        }
        public Builder fragile(boolean fragile){
            this.fragile = fragile;
            return this;
        }
        public Builder insuredAmount(double amount){
            this.insuredAmount = amount;
            return this;
        }

        //集中校验 终装
        public LogisticsOrder build() {
            if (orderNo == null || orderNo.isEmpty())
                throw new IllegalStateException("orderNo 必填且不能为空");
            if (insuredAmount < 0)
                throw new IllegalStateException("保价金额不能为负");
            if (fragile && insuredAmount == 0)
                throw new IllegalStateException("易碎品必须保价");
            return new LogisticsOrder(this);
        }
    }
}

