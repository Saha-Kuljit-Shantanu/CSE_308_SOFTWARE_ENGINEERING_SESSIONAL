public class NoteBook implements Electronic_Device{

    @Override
    public void Storage_module() {

        System.out.println("User can store in NoteBook");
    }

    @Override
    public void Interface_Module() {

        System.out.println("User can interact in NoteBook");

    }

    @Override
    public void Communication_Module() {

        System.out.println("User can communicate in NoteBook");

    }

    @Override
    public String Name() {

        return "Notebook";
    }
}
