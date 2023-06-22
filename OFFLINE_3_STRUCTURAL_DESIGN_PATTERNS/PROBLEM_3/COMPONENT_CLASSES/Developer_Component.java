import java.util.ArrayList;

public class Developer_Component extends Personnel{

    public Developer_Component(String name, String role, String projectName, Components parent) {
        super(name, role, projectName, parent);
    }

    @Override
    public void details() {
        System.out.println("Name: " + super.getName());
        System.out.println("Role: " + super.getRole());
        System.out.println("Current Project: " + super.getProjectName());
        System.out.println("Project Manager assigned: " + super.getParent().getName());
    }

    @Override
    public void add(Components c) {

    }

    @Override
    public void remove() {

        super.getParent().getMyList().remove(this);
    }

    @Override
    public ArrayList<Components> getMyList() {
        return null;
    }

    @Override
    public void hierarchy(String x) {

        System.out.println(x + "-" + super.getName());
    }
}
