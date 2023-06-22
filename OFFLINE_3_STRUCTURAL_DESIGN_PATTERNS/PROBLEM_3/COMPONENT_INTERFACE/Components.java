import java.util.ArrayList;

public interface Components {


    public void details();
    public void add(Components c);
    public void remove();

    public ArrayList<Components> getMyList();

    public void hierarchy(String init);

    //public void setName(String name) ;

    public String getName() ;

    public void setProjectName(String projectName);

    public String getProjectName();

}
