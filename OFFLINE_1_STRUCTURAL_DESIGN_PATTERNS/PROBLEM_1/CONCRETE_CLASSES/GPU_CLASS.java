public class GPU_CLASS implements GPU{

    private int GPUCount ;

    private int gput;

    private int GPUprice;

    public void setGPUCount(int GPUCount){

        this.GPUCount = GPUCount;

    }

    @Override
    public void setGPUType(int gput) {

        this.gput = gput;

    }

    @Override
    public void setGPUPrice(int price) {

        this.GPUprice = price;

    }

    public int getGPUCount(){

        return this.GPUCount ;

    }

    @Override
    public int getGPUType() {

        return this.gput;

    }

    @Override
    public int getGPUPrice() {

        return this.GPUprice;

    }


}
