import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        Coffee coffee1 = new ConcreteCoffee("Americano");

        coffee1 = new AddCoffeeBeans(coffee1);

        System.out.println( coffee1.getCost() );

        Coffee coffee2 = new ConcreteCoffee("Espresso");

        coffee2 = new AddDairyCream(coffee2);

        System.out.println( coffee2.getCost() );

        Coffee coffee3 = new ConcreteCoffee("Capuccino");

        coffee3 = new AddMilk(coffee3);

        coffee3 = new AddCinnamonPowder(coffee3);

        System.out.println( coffee3.getCost() );

        Coffee coffee4 = new ConcreteCoffee("Mocha");

        coffee4 = new AddMilk(coffee4);

        coffee4 = new AddChocolateSauce(coffee4);

        System.out.println( coffee4.getCost() );

    }
}