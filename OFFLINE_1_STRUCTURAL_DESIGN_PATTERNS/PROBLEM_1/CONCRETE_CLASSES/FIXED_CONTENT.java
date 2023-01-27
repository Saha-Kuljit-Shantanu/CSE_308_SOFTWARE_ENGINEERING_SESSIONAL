public class FIXED_CONTENT implements HDD, MOTHERBOARD ,CPU ,BASE_PRICE_FOR_FIXED_CONTENT {

    private int HDDSpace;

    private int fixed_Base_Price;

    private int MBQTT;

    private int CPUQTT;

    // Methods from HDD


    public void setHDDSpace(int space){

        this.HDDSpace = space;

    }

    public int getHDDSpace(){

        return this.HDDSpace;

    }

    //Methods from motherboard


    public void setMBQTT(int MBQTT){

        this.MBQTT = MBQTT;


    }

    public int  getMBQTT(){

        return this.MBQTT;
    }

    //Methods from CPU

    public void setCPUQTT(int CPUQTT){

        this.CPUQTT = CPUQTT;


    }

    public int  getCPUQTT(){

        return this.CPUQTT;
    }

    //Methods from FixedBasePrice

    public void setBasePrice(int price){

        this.fixed_Base_Price = price;
    }

    public int getBasePrice(){

        return this.fixed_Base_Price;



    }



}
