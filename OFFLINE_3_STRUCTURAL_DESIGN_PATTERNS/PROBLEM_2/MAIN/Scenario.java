import java.util.Scanner;
import java.util.Set;

public class Scenario {

    public static Coffee cf(String name,Coffee coffee){

        coffee.setName(name);

        if(name == "Americano" ) {

            coffee = new AddCoffeeBeans(coffee);

        }

        if(name == "Espresso" ) {

            coffee = new AddDairyCream(coffee);

        }

        if(name == "Capuccino" ) {

            coffee = new AddMilk(coffee);
            coffee = new AddCinnamonPowder(coffee);

        }

        if(name == "Mocha" ) {

            coffee = new AddMilk(coffee);
            coffee = new AddChocolateSauce(coffee);

        }

        return coffee;


    }

    public static void main(String[] args) {

        int k=1,cost = 0,ing_num = 0;// k is for customerID

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Americano", "Espresso", "Capuccino", "Mocha"};// coffee available

        while(true){


            ing_num = 0; // Reset Ingredient number to 0

            System.out.println("Welcome Customer " + k + ". Place your order. Choose any of 1 to 4");
            for (int i=0; i<4; i++){

                System.out.println(i+1 + " " + names[i]);// Order Placement Options for Users
            }

            System.out.print("Enter Your Choice : ");

            int selCf = scanner.nextInt();

            //System.out.println("Ingredients" cf(names[i-1]));
            System.out.print("Select Quantity :");

            int selQtt = scanner.nextInt();

            Coffee coffee = new ConcreteCoffee(names[selCf - 1]);//Initialize Coffee class with the provided option

            System.out.println("Ingredients with cost for each cup of your Coffee : ");

            //cf(names[selCf - 1],coffee);

            Set<String> strSet = cf(names[selCf-1],coffee).getIngredients().keySet();



            for(String str: strSet){

                ing_num++;
                System.out.println(" Ingredient: " + ing_num + "\n\t" +"Name: " + str + "\n\tPrice: BDT " + cf(names[selCf-1],coffee).getIngredients().get(str));
                //Name and Price of Each Ingredient in the selected coffee

            }

            System.out.println();

            int c = cf(names[selCf-1],coffee).getCost();
            System.out.println("Total for one coffee " + names[selCf-1] + " : BDT " + c);//Cost of each coffee

            cost = cost + c * selQtt;

            System.out.println("Your order of " + selQtt +" " + names[selCf-1] + " coffees is placed. Price: BDT " + selQtt + "*" + c + " = BDT " + c * selQtt);
            // cost of this specific coffee

            System.out.println("Bill till now : BDT " + cost); //cost till now

            System.out.print("You want to order more? Y/n/Q : ");//Yes,No,Quit

            String n = scanner.next();

            if(n.equalsIgnoreCase("Y")) continue;

            if (n.equalsIgnoreCase("N")) {

                System.out.println("Total Bill for customer " + k + " : BDT " + cost);//Grand total bill
                k++;
                cost = 0; //Reset Cost to 0 for a new customer

            }


            if (n.equalsIgnoreCase("Q")) {

                System.out.println("Total Bill for customer " + k + " : BDT " + cost);//Grand total bill
                System.exit(0);
            }






        }

    }
}
