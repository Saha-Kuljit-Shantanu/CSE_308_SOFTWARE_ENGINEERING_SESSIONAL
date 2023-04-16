import java.util.Scanner;

public class LESS_MONEY_state extends State{

    public LESS_MONEY_state(Vending VM){

        super(VM);

    }

    public LESS_MONEY_state(Vending VM,int choice){

        super(VM);
        if(choice == 0) this.ON_PAY();
        else this.ON_CANCEL_RETURN();

    }
    @Override
    public void ON_SET() {

    }

    @Override
    public void ON_PAY() {

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

        System.out.println("You had paid TK. " + super.getVM().getBalance());
        System.out.println("Now we are returning it.");
        System.out.println();

        super.getVM().setBalance(0);
        super.getVM().setState(new ON_RESET_RELOAD_state(super.getVM()));

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
