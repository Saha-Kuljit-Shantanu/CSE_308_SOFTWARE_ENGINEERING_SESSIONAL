public class Linux extends OS{

    Linux(Electronic_Device ed){

        super(ed);
    }

    @Override
    void task() {

        System.out.println("Running Linux in " + super.getEd().Name());

    }
}
