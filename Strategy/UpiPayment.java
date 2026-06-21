package Strategy;

public class UpiPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment : Rs. " + amount );
    }
}
