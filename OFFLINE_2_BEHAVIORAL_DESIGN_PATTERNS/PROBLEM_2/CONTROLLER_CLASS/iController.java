import java.util.ArrayList;

public interface iController {

    boolean sendReq(Student std);
    boolean obtainResp(int s_ID,int t_ID);
    void update(Student std,int newMark);

    void registerExaminer(Examiner examiner);

    public ArrayList<Student> getStudentList(int exm);

    public void addStudentList(ArrayList<Student> std);

    public void Scrutinize(int fullMark);

}
