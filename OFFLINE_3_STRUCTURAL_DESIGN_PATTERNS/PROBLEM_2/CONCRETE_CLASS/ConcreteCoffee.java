import java.util.Hashtable;

public class  ConcreteCoffee extends Coffee{


    Hashtable<String,Integer> ingredients = new Hashtable<>();

    public ConcreteCoffee(String name){

        super.setName(name);
    }
    @Override
    public Hashtable getIngredients() {

   //    super.addIngredient("Fancy Coffee Mug", 100);
       ingredients.put("Fancy Coffee Mug", 100);
        ingredients.put("Grinded Coffee Beans", 30);

       return ingredients;
    }

    @Override
    public int getCost() {
        return 130;
    }
}
