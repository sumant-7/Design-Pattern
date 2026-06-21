package Decorator;

public class MilkCoffee extends CoffeeDecorator{

    public MilkCoffee(Coffee coffee){
        super(coffee);
        System.out.println("Adding Milk");
    }
    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

}
