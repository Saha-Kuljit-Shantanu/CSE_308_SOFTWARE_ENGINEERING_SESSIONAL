import java.util.Hashtable;

public class AddWater extends CoffeeDecorator{

    Coffee coffee;

    public AddWater(Coffee coffee){

        this.coffee = coffee;

    }

    @Override
    public int getCost() {

        //coffee.setCost(coffee.getCost() + 50);

        return this.coffee.getCost()+ 0;

    }

    @Override
    public Hashtable getIngredients() {

        // coffee.addIngredient("Milk",50);
        coffee.getIngredients().put("Water",0);

        return coffee.getIngredients();
    }


}
