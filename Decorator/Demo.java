package Decorator;

public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        coffee = new MilkCoffee(new SugarAddOn(coffee));
        System.out.println("Cost of Coffee: " + coffee.getCost());
    }
}
