public abstract class OS {

    Electronic_Device ed;

    OS(Electronic_Device ed){

        this.ed = ed;
        ed.Storage_module();
        ed.Interface_Module();
        ed.Communication_Module();
    }

    Electronic_Device getEd(){

        return ed;
    }

    abstract void task();
}
