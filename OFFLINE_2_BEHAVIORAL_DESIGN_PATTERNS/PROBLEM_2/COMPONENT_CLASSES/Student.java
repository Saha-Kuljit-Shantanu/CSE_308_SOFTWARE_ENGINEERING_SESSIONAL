public class Student extends TSC{

    private iController ctrl ;

    private int oldMark;

    private int newMark;

    private int t_ID;

    private boolean recheck_request ;


    public Student(iController ctrl,int s_ID, int t_ID) {
        super(s_ID);


        this.ctrl = ctrl;
        this.t_ID = t_ID;
        this.recheck_request = false;


    }

    public boolean Request(){

        return ctrl.sendReq(this);

    }

    public int getExaminerID(){

        return t_ID;
    }

    public void setExaminerID( int t_ID){

        this.t_ID = t_ID;


    }

    public int getOldMark(){

        return oldMark;
    }

    public int getNewMark(){

        return newMark;
    }

    public void setNewMark(int mark){

        this.newMark = mark;
    }

    public void setOldMark(int mark){

        this.oldMark = mark;
    }

    public void setRecheck_request(boolean status){

        this.recheck_request = status;
    }

    public boolean getRecheck_request(){

        return this.recheck_request;
    }

    public iController getMediator(){

        return ctrl;
    }





}
