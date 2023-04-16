import java.util.Scanner;

public class ON_RESET_RELOAD_state extends State{

    public ON_RESET_RELOAD_state(Vending VM){

        super(VM);
        if(VM.getitemNumber() == 0) this.ON_RELOAD();
        else this.ON_PAY();

    }

    @Override
    public void ON_SET() {

        System.out.println("Do you want to keep the simulation running?");
        System.out.println(" Y : YES ");
        System.out.println(" N : NO ");


        while(true){

            System.out.print(" Enter Your Choice : ");

            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();

            if(a.trim().equalsIgnoreCase("Y") || a.trim().equalsIgnoreCase("YES")){

                System.out.println("OK. So time for the Server to log in.");
                super.set();
                super.getVM().setState(new ON_RESET_RELOAD_state(super.getVM()));
                break;
            }

            else if(a.trim().equalsIgnoreCase("N") || a.trim().equalsIgnoreCase("NO")){

                System.exit(0);
                break;
            }

            else {

                System.out.println("Your choice is invalid. You have to try again. ");
                System.out.println();
            };
        }



    }

    @Override
    public void ON_PAY() {

        System.out.println("Items remaining : " + super.getVM().getitemNumber());
        System.out.println("Price for each : " + super.getVM().getProductPrice());
        System.out.println();
        super.pay();
        super.getVM().setState(new COUNTstate(super.getVM()));

    }

    @Override
    public void ON_LESS_MONEY() {

    }

    @Override
    public void ON_ENOUGH_MONEY() {

    }

    @Override
    public void ON_MORE_MONEY() {

    }

    @Override
    public void ON_CANCEL_RETURN() {

    }

    @Override
    public void ON_RETURN() {

    }

    @Override
    public void ON_RESET() {

    }

    @Override
    public void ON_RELOAD() {

        System.out.println("Sorry, Our items just ran out. We are now handing this vending machine over to Server");
        this.ON_SET();

    }
}
