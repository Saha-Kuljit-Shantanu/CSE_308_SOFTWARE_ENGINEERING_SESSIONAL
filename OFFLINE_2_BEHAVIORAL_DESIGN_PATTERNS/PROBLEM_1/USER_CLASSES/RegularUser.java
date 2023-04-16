import java.util.Scanner;

public class RegularUser extends User{



    private boolean pay;

    public RegularUser(ABCServer abc, String name ){

        super(abc,name);
        pay = false;
    }



    @Override
    public void getNotified() {

        int prev = super.getServer().getPrevState();
        int curr = super.getServer().getCurrState();

        if(prev == 0 && curr == 1){

            System.out.println("Our server is partially available.");
            System.out.println("As a regular user your functionalities are limited.");
            System.out.println("So you have two choices : ");
            System.out.println("0) You want to carry on your limited functionality");
            System.out.println("else) You want to pay an additional $20 per hour to enjoy the full functionality taking all you data to our supplementary DEF Server");
            System.out.print("Enter your choice:");
            Scanner scanner = new Scanner (System.in );

            int x = scanner.nextInt();

            if(x != 0) pay = true;



        }

        if(prev == 0 && curr == 2){

            System.out.println("Our server is currently down.");
            System.out.println("As a regular user your functionalities are limited.");
            System.out.println("So you have two choices : ");
            System.out.println("0) You want to wait until the server is up");
            System.out.println("else) You want to pay an additional $20 per hour to enjoy the full functionality taking all you data to our supplementary DEF Server");
            System.out.print("Enter your choice:");
            Scanner scanner = new Scanner (System.in );

            int x = scanner.nextInt();

            if(x != 0) pay = true;

        }

        if(prev != 0 && curr == 0){

            System.out.println("Our server is up now");
            if(pay == true){

                System.out.println("Your bill is $ x");
                pay = false;

            }
            System.out.println("You can use our Server now");
        }




    }
}
