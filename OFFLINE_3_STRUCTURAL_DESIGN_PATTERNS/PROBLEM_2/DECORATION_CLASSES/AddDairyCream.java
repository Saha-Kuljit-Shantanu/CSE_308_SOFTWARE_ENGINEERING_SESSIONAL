import java.util.Hashtable;

public class AddDairyCream extends CoffeeDecorator{

    Coffee coffee;

    public AddDairyCream(Coffee coffee){

        this.coffee = coffee;

    }

    @Override
    public int getCost() {

        //coffee.setCost(coffee.getCost() + 50);

        return this.coffee.getCost()+ 40;

    }

    @Override
    public Hashtable getIngredients() {

        // coffee.addIngredient("Milk",50);
        coffee.getIngredients().put("Dairy Cream",40);

        return coffee.getIngredients();
    }


}
