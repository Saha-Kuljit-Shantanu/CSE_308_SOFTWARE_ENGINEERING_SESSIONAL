public class RETURNstate extends State{

    public RETURNstate(Vending VM){

        super(VM);
        this.ON_RETURN();
    }


    @Override
    public void ON_SET() {

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

        System.out.print("Return : TK. ");
        System.out.println(super.getVM().getBalance() - super.getVM().getProductPrice());
        System.out.println();
        super.getVM().setState(new noRETURNstate(super.getVM()));
    }

    @Override
    public void ON_RESET() {

    }

    @Override
    public void ON_RELOAD() {

    }
}
