public class SmartPhone implements Electronic_Device{


    @Override
    public void Storage_module() {

        System.out.println("User can store in Smartphone");
    }

    @Override
    public void Interface_Module() {

        System.out.println("User can interact in smartphone");

    }

    @Override
    public void Communication_Module() {

        System.out.println("User can communicate in smartphone");

    }

    @Override
    public String Name() {

        return "SmartPhone";
    }
}
