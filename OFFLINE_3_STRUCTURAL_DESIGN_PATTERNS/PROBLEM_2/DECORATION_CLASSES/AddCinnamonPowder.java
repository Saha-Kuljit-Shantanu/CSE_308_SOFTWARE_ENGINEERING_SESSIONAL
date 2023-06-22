import java.util.Hashtable;

public class AddCinnamonPowder extends CoffeeDecorator{

    Coffee coffee;

    public AddCinnamonPowder(Coffee coffee){

        this.coffee = coffee;

    }

    @Override
    public int getCost() {

        //coffee.setCost(coffee.getCost() + 50);

        return this.coffee.getCost()+ 50;

    }

    @Override
    public Hashtable getIngredients() {

        // coffee.addIngredient("Milk",50);
        coffee.getIngredients().put("Cinnamon Powder",50);

        return coffee.getIngredients();
    }


}
