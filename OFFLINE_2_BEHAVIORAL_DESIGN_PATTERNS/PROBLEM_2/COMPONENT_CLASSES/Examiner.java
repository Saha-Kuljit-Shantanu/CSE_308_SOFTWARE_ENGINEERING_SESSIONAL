public class Examiner extends TSC{

    private iController ctrl ;
    private int curr_std_id;

    public Examiner(iController ctrl,int t_ID) {
        super(t_ID);

        this.ctrl = ctrl;
    }

    public void setCurrStdID(int s_id){

        this.curr_std_id = s_id;
    }

    public boolean Response(){

        return ctrl.obtainResp(curr_std_id,super.getID());
    }

    public iController getMediator(){

        return ctrl;
    }


}
