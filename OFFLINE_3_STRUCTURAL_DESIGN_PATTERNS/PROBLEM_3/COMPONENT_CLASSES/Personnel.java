import java.util.ArrayList;

public abstract class Personnel implements Components{

    private String name;

    private String role;

    private Components parent;

    private String projectName;

    public Personnel(String name, String role,String projectName,Components parent){

        this.name = name;
        this.role = role;
        this.projectName = projectName;
        this.parent = parent;

    }

    public Components getParent(){

        return this.parent;
    }

    public String getName(){

        return this.name;
    }

    public String getRole(){

        return this.role;
    }

    public String getProjectName(){

        return this.projectName;
    }

    public void setProjectName(String projectName) {

        this.projectName = projectName;
    }

    //public abstract ArrayList<Components> getParentList();
}
