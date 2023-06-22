public class Windows extends OS{

    //Electronic_Device ed;

    Windows(Electronic_Device ed){

        super(ed);
    }

    @Override
    void task() {

        System.out.println("Running Windows in " + super.getEd().Name());

    }
}
