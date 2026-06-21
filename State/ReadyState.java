package State;

public class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Vending Machine is Ready");
    }
}
