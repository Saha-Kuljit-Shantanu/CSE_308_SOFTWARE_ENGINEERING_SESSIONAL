public class Type_3 extends PCBUILDER{

    private final String cmpt = "DVD drive";

    private final int componentPrice = 6000;

    private final String pt = "11th generation Intel Core i9";

    private final int processorPrice = 65000;

    public Type_3(){

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

