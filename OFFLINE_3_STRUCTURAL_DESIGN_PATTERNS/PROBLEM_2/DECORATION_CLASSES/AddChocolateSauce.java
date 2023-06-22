import java.util.Hashtable;

public class AddChocolateSauce extends CoffeeDecorator{

    Coffee coffee;

    public AddChocolateSauce(Coffee coffee){

        this.coffee = coffee;

    }

    @Override
    public int getCost() {

        //coffee.setCost(coffee.getCost() + 50);

        return this.coffee.getCost()+ 60;

    }

    @Override
    public Hashtable getIngredients() {

        // coffee.addIngredient("Milk",50);
        coffee.getIngredients().put("Chocolate Sauce",60);

        return coffee.getIngredients();
    }


}
