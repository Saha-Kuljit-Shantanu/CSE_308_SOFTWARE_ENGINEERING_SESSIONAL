import java.util.Hashtable;

public abstract class Coffee {

    private Hashtable<String, Integer> ingredients = new Hashtable<>();

    private int cost;

    private String name ;

//    public Coffee(String ingredientName, int Price){
//
//
//        this.addIngredient(ingredientName,Price);
//        this.setCost(this.getCost() + Price);
//    }
//
//    public void initCoffee(String name){
//
//        this.name = name;
//        this.ingredients.put("Fancy Coffe Mug",100);
//        this.cost = 100;
//    }



//    public void setCost(int cost) {
//
//        this.cost = cost;
//    }
//
//    public void addIngredient(String ingredientName, int price){
//
//        this.ingredients.put(ingredientName,price);
//    }

    public abstract int getCost();

    public abstract Hashtable getIngredients() ;

    public String getName() {

        return this.name;
    }

    public void setName(String name){

        this.name = name;
    }

}
