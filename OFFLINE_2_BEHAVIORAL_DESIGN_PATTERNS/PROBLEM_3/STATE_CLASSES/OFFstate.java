import java.util.Scanner;

public class OFFstate extends State{

    public OFFstate(Vending VM){

        super(VM);
        this.ON_SET();

    }

    @Override
    public void ON_SET() {

        super.set();

        super.getVM().setState(new ON_RESET_RELOAD_state(super.getVM()));

    }

    @Override
    public void ON_PAY() {

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

    }


}
