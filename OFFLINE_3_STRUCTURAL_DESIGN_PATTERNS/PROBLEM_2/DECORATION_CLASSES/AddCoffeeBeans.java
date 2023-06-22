import java.util.Hashtable;

public class AddCoffeeBeans extends CoffeeDecorator{

    Coffee coffee;

    public AddCoffeeBeans(Coffee coffee){

        this.coffee = coffee;

    }

    @Override
    public int getCost() {

        //coffee.setCost(coffee.getCost() + 50);

        return this.coffee.getCost()+ 30;

    }

    @Override
    public Hashtable getIngredients() {

        // coffee.addIngredient("Milk",50);
        coffee.getIngredients().put("Additional Coffee Beans",30);

        return coffee.getIngredients();
    }
}
