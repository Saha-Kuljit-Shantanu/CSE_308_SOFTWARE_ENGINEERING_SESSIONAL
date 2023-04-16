
import java.util.Scanner;
public class COUNTstate extends State{

    public COUNTstate(Vending VM){

        super(VM);
        if(VM.getBalance() < VM.getProductPrice()) this.ON_LESS_MONEY();
        else if(VM.getBalance() > VM.getProductPrice()) this.ON_MORE_MONEY();
        else this.ON_ENOUGH_MONEY();

    }
    @Override
    public void ON_SET() {

    }

    @Override
    public void ON_PAY() {

    }

    @Override
    public void ON_LESS_MONEY() {

        Scanner scanner = new Scanner(System.in);

        int rem = super.getVM().getProductPrice() -super.getVM().getBalance();
        System.out.println("You still have to pay TK. " +  rem +" to get the item");
        System.out.println("Select from the following : ");
        System.out.println(" 0 : Pay the rest.");
        System.out.println(" 1 : Kill Transaction. Your transaction shall rollback and your money will be returned.");
        System.out.println();



        int choice = -1;

        while(choice !=0 && choice != 1){

            System.out.print("Enter Your Choice : ");

            choice = scanner.nextInt();

            if(choice == 0 || choice == 1){
                super.getVM().setState(new LESS_MONEY_state(super.getVM(), choice));

            }

            else System.out.println("Your choice is not valid. You have to try again");
            System.out.println();
        }




    }

    @Override
    public void ON_ENOUGH_MONEY() {

        System.out.println("Your Purchase is successful. No return.");
        System.out.println("Thank you for purchasing from our vending machine.");
        super.getVM().setState(new noRETURNstate(super.getVM()));

    }

    @Override
    public void ON_MORE_MONEY() {

        System.out.println("Your Purchase is successful.");
        System.out.println("Thank you for purchasing from our vending machine.");
        super.getVM().setState(new RETURNstate(super.getVM()));

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

    }
}
