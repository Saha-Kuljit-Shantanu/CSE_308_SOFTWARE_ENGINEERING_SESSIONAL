import java.util.ArrayList;

public class ABCServer {

    private int currstate;
    private int prevstate;

    private ArrayList<User> users;

    public ABCServer(){

        int prevstate = 0;
        int currstate = 0;
        users = new ArrayList<>();
    }

    public void setCurrState(int state){

        this.currstate = state;
    }

    public int getCurrState(){

        return this.currstate ;
    }

    public void setPrevState(int state){

        this.prevstate = state;
    }

    public int getPrevState(){

        return this.prevstate ;
    }

    public void subScribe( User u){

        users.add(u);


    }

    public boolean unsubScribe( User u){

        for(User e : users){

            if(u.getName().equalsIgnoreCase(e.getName())){

                users.remove(e);
                return false;
            }


        }



        return true;


    }

    public void notify_All(){

        for(User e: users){

            System.out.println("----- Notification for " + e.getName() +" ------");
            e.getNotified();

        }
    }



}
