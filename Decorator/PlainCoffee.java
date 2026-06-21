package Decorator;

public class PlainCoffee implements Coffee{
    public PlainCoffee(){
        System.out.println("This is Plain Coffee");
    }
    @Override
    public double getCost() {
        return 1.0;
    }
}
