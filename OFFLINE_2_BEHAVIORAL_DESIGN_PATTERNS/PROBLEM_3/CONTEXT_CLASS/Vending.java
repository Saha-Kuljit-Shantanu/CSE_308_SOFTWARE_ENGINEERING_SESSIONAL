public class Vending {

    private int itemNumber;
    private int productPrice;
    private int balance;
    private State state;

    public Vending(){

        this.state = new OFFstate(this);
    }

    public void setState(State state){

        this.state = state ;

    }

    public State getState(){

        return this.state ;
    }

    public void setBalance(int balance){

        this.balance = balance ;
    }

    public int getBalance(){

        return this.balance ;
    }

    public void setItemNumber(int itemNumber){

        this.itemNumber = itemNumber ;
    }

    public int getitemNumber(){

        return this.itemNumber ;
    }

    public void setProductPrice(int productPrice){

        this.productPrice = productPrice ;
    }

    public int getProductPrice(){

        return this.productPrice;
    }

}
