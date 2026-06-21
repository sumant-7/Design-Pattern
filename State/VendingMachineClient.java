package State;

public class VendingMachineClient {
    private VendingMachineState state;
    VendingMachineClient(){
        state = new ReadyState();
    }
    public void setState(VendingMachineState state){
        this.state = state;
    }
    public void request(){
        state.handleRequest();
    }

    public static void main(String[] args) {
        VendingMachineClient vendingMachineClient = new VendingMachineClient();
        vendingMachineClient.request();
        vendingMachineClient.setState(new ProductSelectedState());
        vendingMachineClient.request();
        vendingMachineClient.setState(new PaymentProcessingState());
        vendingMachineClient.request();
        vendingMachineClient.setState(new OutOfStockState());
        vendingMachineClient.request();
    }
}
