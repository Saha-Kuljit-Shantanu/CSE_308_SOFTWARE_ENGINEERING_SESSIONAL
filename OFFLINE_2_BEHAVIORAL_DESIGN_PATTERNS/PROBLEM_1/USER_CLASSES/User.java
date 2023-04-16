public abstract class User {

    private ABCServer abc ;
    private String name ;

    public User(ABCServer abc, String name){


        this.abc = abc ;
        this.abc.subScribe(this);
        this.name = name ;

    }

    public void setServer(ABCServer abc){

        this.abc = abc;
    }

    public ABCServer getServer(){

        return this.abc;
    }

    public void unsubScribe(){

        if( abc.unsubScribe(this) == false) System.out.println("You are now unsubscribed") ;
        else System.out.println("Sorry , you have no subscription here");
    }

    public String getName(){

        return this.name;
    }



    abstract void getNotified();

}
