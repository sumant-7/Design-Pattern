package Strategy;

public class PatmentStrategy {
    private PaymentGateway paymentGateway;
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void pay(double amount){
        paymentGateway.pay(amount);
    }
}
