import java.util.Scanner;

public class PremiumUser extends User{

    private int ABCServer;

    private boolean bothservice;


    public PremiumUser(ABCServer abc, String name) {
        super(abc, name);
        bothservice = false;
    }



    @Override
    public void getNotified() {

        int prev = super.getServer().getPrevState();
        ;
        int curr = super.getServer().getCurrState();

        if (prev == 0 && curr == 1) {

            System.out.println("Our server is partially available.");
            System.out.println("As you are our premium user. You may have the following choices :");
            System.out.println("0) Get service from us and our supplementary DEF company partially");
            System.out.println("else ) Get service from our supplementary DEF company completely");
            System.out.print("Enter your choice:");
            Scanner scanner = new Scanner(System.in);

            int x = scanner.nextInt();

            if (x == 0) {
                System.out.println("Getting service from both ABC and DEF");
                bothservice = true;
            }
            else System.out.println("Getting service from DEF only");

        }

        if (prev == 0 && curr == 2) {

            System.out.println("Our server is currently down.");
            System.out.println("You are receiving service from our supplementary DEF company completely");

        }

        if (prev == 1 && curr == 2) {

            System.out.println("Our server is currently down.");
            if(bothservice == true) {

                System.out.println("You were taking partial service from ABC and DEF. ");
            }System.out.println("You are receiving service from our supplementary DEF company completely");

        }
    }
}
