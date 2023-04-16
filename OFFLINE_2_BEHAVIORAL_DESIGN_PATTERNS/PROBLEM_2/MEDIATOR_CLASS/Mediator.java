import java.util.ArrayList;
import java.util.Random;

public class Mediator implements iController{


    Examiner examiner ;

    private ArrayList<Student>[] studentList ;

    public Mediator(int n){

        studentList = new ArrayList[n];

        for(int i=0;i<n;i++){

            studentList[i] = new ArrayList<>();

        }

    }


    public void registerExaminer(Examiner examiner){

        this.examiner = examiner;
    }
    @Override
    public boolean sendReq(Student std) {

        if(std.getExaminerID() > studentList.length - 1) {

            System.out.println("Sorry, there is no teacher with this ID yet");
            return false;
        }

        System.out.println("Re-examine request sent from student id : "+ std.getID());
        System.out.println("Redirecting request to examiner : "+ std.getExaminerID());
       // studentList[std.getExaminerID()].add(std);
        examiner.setCurrStdID(std.getID());
        std.setRecheck_request(true);

        return true;
    }

    @Override
    public boolean obtainResp(int s_ID,int t_ID) {

        System.out.println("Getting response from examiner : " + t_ID);
        System.out.println("Re-examine request got from student id : " + s_ID);
        return true;
    }

    @Override
    public void update(Student std,int newMark) {

        std.setNewMark(newMark);
    }

    public ArrayList<Student> getStudentList(int exm) {

        return studentList[exm];
    }

    public void addStudentList(ArrayList<Student> std) {

        studentList[examiner.getID()]= std;

    }

    @Override
    public void Scrutinize(int fullMark) {

        Random random = new Random();


        int z = 0;


        for(Student e: studentList[examiner.getID()]){

            int x = random.nextInt(10);
            int y = random.nextInt(-fullMark/10,fullMark/3 - e.getOldMark()/3);
            int k = e.getOldMark();

            if(x%10 < 6) {
                studentList[examiner.getID()].get(z).setOldMark(studentList[examiner.getID()].get(z).getNewMark());
                studentList[examiner.getID()].get(z).setNewMark( k + y);
            }
            z++;
        }

    }
}
