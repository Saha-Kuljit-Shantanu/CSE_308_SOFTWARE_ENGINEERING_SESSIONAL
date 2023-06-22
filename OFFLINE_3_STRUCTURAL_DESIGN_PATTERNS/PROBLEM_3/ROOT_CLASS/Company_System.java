import java.util.ArrayList;

public class Company_System {

    private ArrayList<Company_composite> list = new ArrayList<>();

    public void add(Company_composite c){
        //System.out.println(list.size());
        list.add(c);
        c.setParent(this);
    }

    public ArrayList<Company_composite> getList() {
        return list;
    }

    public void Hierarchy(){

        for(Company_composite i:list){

            i.hierarchy("");
        }
    }
}
