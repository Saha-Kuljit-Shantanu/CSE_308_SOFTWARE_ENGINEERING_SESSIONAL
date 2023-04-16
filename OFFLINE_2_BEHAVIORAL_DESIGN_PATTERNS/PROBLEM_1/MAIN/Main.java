import java.util.Scanner;


public class Main {


    public static void driver(ABCServer abc, User u1, User u2){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ------ Server ------");
        System.out.println("Currently at state : "+ abc.getCurrState());
        System.out.print("Choose you state now : 0(operational) ,1(partially down) , 2(Fully down) ,else Quit: " );
        int x = scanner.nextInt();

        if(x<0 || x>3) System.exit(0);

        abc.setPrevState(abc.getCurrState());
        abc.setCurrState(x);

        abc.notify_All();

    }
    public static void main(String[] args){

        ABCServer abc = new ABCServer();
        User u1 = new RegularUser(abc,"R");
        User u2 = new PremiumUser(abc,"P");

        while(true){

            driver(abc,u1,u2);
        }


    }
}