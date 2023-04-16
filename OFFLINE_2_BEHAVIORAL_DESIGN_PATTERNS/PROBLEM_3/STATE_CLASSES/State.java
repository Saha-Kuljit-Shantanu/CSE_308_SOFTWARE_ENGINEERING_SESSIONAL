import java.util.Scanner;

public abstract class State {

    private Vending VM;

    public State(Vending VM){

        this.VM = VM;
    }

    public Vending getVM(){

        return this.VM;
    }

    public void set(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("For SERVER -------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("The Vending machine is about to turn on. For setup provide the following information");

        System.out.print("Enter the Product Quantity : ");
        VM.setItemNumber(scanner.nextInt());

        System.out.print("Enter the Product Price : ");
        VM.setProductPrice(scanner.nextInt());

        VM.setBalance(0);

        System.out.println("Now that the server has provided all the information, the Vending Machine is ready to go.");
        System.out.println("The Vending Machine will now be handed over for the Users to use.");

        System.out.println();
        System.out.println();

        System.out.println("For USER -------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    public void pay(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose from the following notes: ");
        System.out.println(" 1 : TK. 1 coin");
        System.out.println(" 2 : TK. 2 coin");
        System.out.println(" 3 : TK. 5 coin");
        System.out.println(" 4 : TK. 1 note");
        System.out.println(" 5 : TK. 2 note");
        System.out.println(" 6 : TK. 5 note");
        System.out.println(" 7 : TK. 10 note");
        System.out.println(" 8 : TK. 20 note");
        System.out.println(" 9 : TK. 50 note");
        System.out.println(" 10 : TK. 100 note");

        System.out.println();


        int choice = 0;
        int balance = VM.getBalance();

        while(choice > 10 || choice < 1){

            System.out.print("Enter Your Choice : ");

            choice = scanner.nextInt();

            if(choice == 1 || choice == 4){

                balance = balance + 1;
            }

            if(choice == 2 || choice == 5){

                balance = balance + 2;
            }

            if(choice == 3 || choice == 6){

                balance = balance + 5;
            }

            if(choice == 7){

                balance = balance + 10;
            }

            if(choice == 8){

                balance = balance + 20;
            }

            if(choice == 9){

                balance = balance + 50;
            }

            if(choice == 10){

                balance = balance + 100;
            }

            if(choice<1 || choice > 10) System.out.println("Your choice is not valid. You have to try again");
            System.out.println();

        }




        VM.setBalance(balance);
    }

    public abstract void ON_SET();
    public abstract void ON_PAY();
    public abstract void ON_LESS_MONEY();
    public abstract void ON_ENOUGH_MONEY();
    public abstract void ON_MORE_MONEY();
    public abstract void ON_CANCEL_RETURN();

    public abstract void ON_RETURN();

    public abstract void ON_RESET();

    public abstract void ON_RELOAD();

}
