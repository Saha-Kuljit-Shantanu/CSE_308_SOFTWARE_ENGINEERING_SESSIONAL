public class Type_2 extends PCBUILDER{

    private final String cmpt = "Liquid Cooler";

    private final int componentPrice = 17000;

    private final String pt = "11th generation Intel Core i7";

    private final int processorPrice = 37000;

    public Type_2(){

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

