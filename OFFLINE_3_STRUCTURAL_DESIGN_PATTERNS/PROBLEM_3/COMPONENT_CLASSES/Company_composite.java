import java.util.ArrayList;

public class Company_composite  implements Components{

    private String name;

    private Company_System parent;
    private ArrayList<Components> managerList = new ArrayList<>();

    public Company_composite(String name){

        this.name = name;
    }

    @Override
    public void details() {

        System.out.println("Name: " + name);
        System.out.println("Number of Project Managers: " + managerList.size());

    }

    @Override
    public void add(Components c) {

        managerList.add(c);

    }

    public void setParent(Company_System parent) {

        this.parent = parent;
    }

    public Company_System getParent(){

        return parent;
    }

    @Override
    public void remove() {

        for(int i = managerList.size()-1; i>= 0;i--){

            managerList.get(i).remove();

        }
        //managerList.clear();
        parent.getList().remove(this);



    }


    public void hierarchy(String x){

        System.out.println("-" + name);
        for(Components i: managerList){

            i.hierarchy(x+"\t");
        }

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public void setProjectName(String projectName) {

    }

    @Override
    public String getProjectName() {
        return null;
    }

    public ArrayList<Components> getMyList() {

        return managerList;
    }
}
