import java.util.ArrayList;

public class PC extends FIXED_CONTENT implements CONTENT, PROCESSOR{

    private ArrayList<RAM_CLASS> ram = new ArrayList<>();

    private ArrayList<GPU_CLASS> gpu = new ArrayList<>();

    private String cmpt;

    private int componentprice;



    private String pt;

    private int processorPrice;

    // Methods from RAM


    public void addRAM(int frequency,int price){

        RAM_CLASS r = new RAM_CLASS();
        r.setRAMType("8 GB DDR4");

        for(int i=0;i< ram.size(); i++){

            if (frequency == ram.get(i).getVariation()){

                ram.get(i).setRAMCount(ram.get(i).getRAMCount() + 1);
                return;
            }
        }

        r.setRAMCount(1);
        r.setVariation(frequency);
        r.setRAMPrice(price);
        ram.add(r);

    }

    ArrayList<RAM_CLASS> getRAM(){

        return ram;

    }


    // Methods from CONTENT

    @Override
    public void setComponent(String cmpt) {

        this.cmpt = cmpt;

    }

    @Override
    public void setComponentPrice(int price) {

        this.componentprice = price;

    }

    @Override
    public String getComponent() {

        return this.cmpt;

    }

    @Override
    public int getComponentPrice() {

        return componentprice;

    }

    //Methods from GPU


    public void addGPU(int type,int price){

        GPU_CLASS g = new GPU_CLASS();

        for(int i=0;i< gpu.size(); i++){

            if (type == gpu.get(i).getGPUType()){

                gpu.get(i).setGPUCount(gpu.get(i).getGPUCount() + 1);
                return;
            }
        }

        g.setGPUCount(1);
        g.setGPUType(type);
        g.setGPUPrice(price);
        gpu.add(g);

    }

    ArrayList<GPU_CLASS> getGPU(){

        return gpu;

    }


    //Methods from PROCESSOR

    @Override
    public void setProcessorType(String pt) {

        this.pt = pt;

    }

    @Override
    public void setProcessorPrice(int price) {

        this.processorPrice = price;

    }

    @Override
    public String getProcessorType() {

        return this.pt;

    }

    @Override
    public int getProcessorPrice() {

        return this.processorPrice;

    }
}
