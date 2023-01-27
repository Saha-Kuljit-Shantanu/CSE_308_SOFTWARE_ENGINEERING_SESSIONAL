public class Gaming extends PCBUILDER{

    private final String cmpt = "Not Applicable";

    private final int componentPrice = 0;

    private final String pt = "AMD Ryzen 7 5700X";

    private final int processorPrice = 28000;

    public Gaming(){

        setComponent();
        setComponentPrice();
        setProcessorType();
        setProcessorPrice();
    }



    @Override
    public void setComponent() {

        this.getPC().setComponent(cmpt);

    }

    @Override
    public void setComponentPrice() {

        this.getPC().setComponentPrice(componentPrice);

    }

    @Override
    public void setProcessorType() {

        this.getPC().setProcessorType(pt);

    }

    @Override
    public void setProcessorPrice() {

        this.getPC().setProcessorPrice(processorPrice);

    }


}
