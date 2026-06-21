package Strategy;

public class CardPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Card Payment : Rs. " + amount );
    }
}
