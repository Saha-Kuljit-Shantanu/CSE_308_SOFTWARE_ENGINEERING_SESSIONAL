import java.util.ArrayList;

public class Manager_Component extends Personnel{



    ArrayList<Components> developerList = new ArrayList<>();

    public Manager_Component(String name, String role,String projectName, Components parent) {
        super(name, role, projectName, parent);
    }



    @Override
    public void details() {

        System.out.println("Name: " + super.getName());
        System.out.println("Role: " + super.getRole());
        System.out.println("Current Project: " + super.getProjectName());
        System.out.println("Number of Supervisees: " + developerList.size());
    }

    @Override
    public void add(Components c) {

        developerList.add(c);

    }

    @Override
    public void remove() {

        for(int i = developerList.size()-1; i>= 0;i--){

            developerList.get(i).remove();

        }

        //developerList.clear();
        super.getParent().getMyList().remove(this);


    }

    @Override
    public ArrayList<Components> getMyList() {
        return developerList;
    }

    @Override
    public void hierarchy(String x) {
        System.out.println(x + "-" + super.getName() + "(" + super.getProjectName() + ")");
        for(Components i: developerList){

            i.hierarchy(x+"\t");
        }
    }


//    public void setProjectName(String projectName){
//
//        this.projectName = projectName;
//    }
//
//    public String getProjectName(){
//
//        return this.projectName ;
//    }


}
