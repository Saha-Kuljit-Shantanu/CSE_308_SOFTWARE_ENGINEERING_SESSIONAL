public abstract class PCBUILDER  {

    //private final String RAMType = " 8 GB DDR4";

    private PC pc = new PC();

    public PCBUILDER(){

        //pc.setRAMType(RAMType);
        pc.setCPUQTT(1);
        pc.setMBQTT(1);
        pc.setHDDSpace(1);
        pc.setBasePrice(70000);

    }

    public PC getPC(){

        return pc;

    }

  /*  public void setRAMType(String RAMType){

        pc.setRAMType(RAMType);
    }

    public void setVariation(int frequency){

        pc.setVariation(frequency);
    }

    public void setRAMPrice(int price){

        pc.setRAMPrice(price);
    }

    //Setter Methods from GPU

    public void setGPUType(int gput){

        pc.setGPUType(gput);
    }

    public void setGPUPrice(int price){

        pc.setGPUPrice(price);
    }*/

    //Setter Methods from CONTENT

    public abstract void setComponent();

    public abstract void setComponentPrice();

    //Setter Methods from PROCESSOR

    public abstract void setProcessorType();

    public abstract void setProcessorPrice();

  /*  //Getter Methods from RAM


    public abstract int getVariation();

    public abstract int getRAMPrice();

    //Getter Methods from GPU

    public abstract int getGPUType();

    public abstract int getGPUPrice();

    //Setter Methods from CONTENT

    public abstract String getComponent();

    public abstract int getComponentPrice();

    //Setter Methods from PROCESSOR

    public abstract String getProcessorType();

    public abstract int getProcessorPrice();

*/

}
