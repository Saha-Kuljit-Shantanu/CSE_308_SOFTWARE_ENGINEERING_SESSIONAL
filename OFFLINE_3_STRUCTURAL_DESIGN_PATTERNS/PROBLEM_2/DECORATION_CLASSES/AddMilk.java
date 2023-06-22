import java.util.Hashtable;

public class AddMilk extends CoffeeDecorator {



    Coffee coffee;

    public AddMilk(Coffee coffee){

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
        coffee.getIngredients().put("Milk",50);

        return coffee.getIngredients();
    }


}
