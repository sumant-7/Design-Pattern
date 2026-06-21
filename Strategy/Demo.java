package Strategy;

public class Demo {
    public static void main(String[] args) {
        PatmentStrategy paymentStrategy = new PatmentStrategy();
        paymentStrategy.setPaymentGateway(new UpiPayment());
        paymentStrategy.pay(100);
    }
}
