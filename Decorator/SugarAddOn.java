package Decorator;

public class SugarAddOn extends CoffeeDecorator{
    public SugarAddOn(Coffee coffee){
        super(coffee);
        System.out.println("Adding Sugar");
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
