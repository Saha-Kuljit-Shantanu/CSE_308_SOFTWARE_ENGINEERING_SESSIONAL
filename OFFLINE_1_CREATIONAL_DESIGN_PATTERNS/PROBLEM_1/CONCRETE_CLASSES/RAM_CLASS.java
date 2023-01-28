public class RAM_CLASS implements RAM{


    private int RAMCount ;

    private String RAMtype;

    private int RAMfrequency;

    private int RAMprice;

    public void setRAMCount(int RAMCount){

        this.RAMCount = RAMCount;

    }

    public void setRAMType(String RAMtype){

        this.RAMtype = RAMtype;
    }

    @Override
    public void setVariation(int frequency) {

        this.RAMfrequency = frequency;

    }

    @Override
    public void setRAMPrice(int price) {

        this.RAMprice = price;

    }

    public int getRAMCount(){

        return this.RAMCount ;

    }

    @Override
    public String getRAMType() {

        return this.RAMtype;

    }

    @Override
    public int getVariation() {

        return this.RAMfrequency;
    }

    @Override
    public int getRAMPrice() {

        return this.RAMprice;

    }


}
