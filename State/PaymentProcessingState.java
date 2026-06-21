package State;

public class PaymentProcessingState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Payment Processing");
    }
}
