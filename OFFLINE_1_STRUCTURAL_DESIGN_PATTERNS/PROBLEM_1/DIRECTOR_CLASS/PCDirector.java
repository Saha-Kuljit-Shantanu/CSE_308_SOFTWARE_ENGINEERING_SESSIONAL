import java.util.ArrayList;

public class PCDirector {

    private PCBUILDER builder;



    public void constructType(int type){

        if(type == 0) builder = new Gaming();
        if(type == 1) builder = new Type_1();
        if(type == 2) builder = new Type_2();
        if(type == 3) builder = new Type_3();


    }

    public void customizeRAM(int type){

        if(type == 0) return;
        if(type == 1) builder.getPC().addRAM(2666,2620);
        if(type == 2) builder.getPC().addRAM(3200,2950);

    }

    public void customizeGPU(int type){

        if(type == 0) return;
        if(type == 1) builder.getPC().addGPU(2,6500);
        if(type == 2) builder.getPC().addGPU(4,7600);

    }

    public PCBUILDER getBuilder(){

        return builder;
    }



}
