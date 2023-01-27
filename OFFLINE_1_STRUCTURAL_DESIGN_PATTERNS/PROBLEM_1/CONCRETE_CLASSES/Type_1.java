public class Type_1 extends PCBUILDER{

    private final String cmpt = "CPU Cooler";

    private final int componentPrice = 36000;

    private final String pt = "11th generation Intel Core i5";

    private final int processorPrice = 20000;

    public Type_1(){

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
