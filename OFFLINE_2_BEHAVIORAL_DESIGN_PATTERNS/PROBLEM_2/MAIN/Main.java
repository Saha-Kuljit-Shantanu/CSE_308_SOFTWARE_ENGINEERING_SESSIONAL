import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //static ArrayList<Student>[] recheck_queue ;

    public static void Students_Choice(iController mediator, Examiner[] examiner, int first,int stdNum){

        Scanner scanner = new Scanner(System.in);
        boolean flag = false ;

        int s_ID = 0;

        while(s_ID < first || s_ID > first + stdNum){

            System.out.print("Provide Your Entire Student id : ");
            s_ID = scanner.nextInt();
            if(s_ID < first || s_ID > first + stdNum) System.out.println(" Your ID is not there , Sorry.");
        }

        System.out.println("Choose from the following IDs : ");
        System.out.println("ID 0: CSE 305 SECTION A");
        System.out.println("ID 1: CSE 305 SECTION B");
        System.out.println("ID 2: CSE 307 SECTION A");
        System.out.println("ID 3: CSE 307 SECTION B");
        System.out.println("ID 4: CSE 309 SECTION A");
        System.out.println("ID 5: CSE 309 SECTION B");
        System.out.println("ID 6: CSE 311 SECTION A");
        System.out.println("ID 7: CSE 311 SECTION B");
        System.out.println("ID 8: CSE 315 SECTION A");
        System.out.println("ID 9: CSE 315 SECTION B");
        System.out.print("Enter your choice : ");

        int t_ID = scanner.nextInt();

        Student y = new Student(mediator,s_ID,t_ID);

        if(y.getExaminerID() < examiner.length -1){
            y = examiner[t_ID].getMediator().getStudentList(t_ID).get(s_ID - first);
            y.getMediator().registerExaminer(examiner[t_ID]);
        }

        flag = y.Request();

        if(flag == true){


            flag = examiner[t_ID].Response();
            y.setRecheck_request(flag);
         //   recheck_queue[t_ID].add(y);
        }





    }

    public static void Examiners_Choice(iController mediator, Examiner[] examiner,int first,int fullMark,ArrayList<Student>[] list,int stdNum) {

        String password = "pass";
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.print("Enter Teachers' password (Pressing q will quit you login): ");
            password = scanner.next();
            if(password.equals( "password")) {
                System.out.println("Permission Granted");
                break;
            }

            if(password.equals("q") || password.equals("Q")){

                while(true) {
                    driver(mediator,examiner,first,fullMark,list,stdNum);
                }
            }

            else{

                System.out.println("You have entered a wrong password. Try again.");
            }
        }

        Random random = new Random();

        System.out.print("Enter your ID : ");
        int t_ID = scanner.nextInt();
        int p = 1;


        float x = random.nextFloat(-1,1);

        for (Student e: examiner[t_ID].getMediator().getStudentList(t_ID)) {

            if(e.getRecheck_request() == true){

                int q = random.nextInt(5);

                int y = random.nextInt(fullMark - e.getOldMark());
                if(q > 2) e.setOldMark(e.getNewMark());
                if(q > 2) e.setNewMark((int)(x* y+ e.getOldMark()));
                if( e.getOldMark() != e.getNewMark() && q>2)System.out.println(p + ") ID: " + e.getID() + " ,Previous Marks: " + e.getOldMark() + " ,Updated Marks: " + e.getNewMark());
                if(q > 2) p++;
                e.setRecheck_request(false);
              //  System.out.println(q);
            }

        }

      //  recheck_queue[t_ID].clear();

        System.out.println(" Work done. Logging out.");

    }

    public static void Students_Print(ArrayList<Student> list,int s_ID,int t_ID,int first){

        System.out.println( "Old mark from examiner " + t_ID + " was : " +list.get(s_ID - first).getOldMark());
        System.out.println( "New mark from examiner " + t_ID + " is : " +list.get(s_ID - first).getNewMark());


    }

    public static int getChoice(){

        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while(choice <0 || choice > 3){

            System.out.println("Choose from the following four : ");
            System.out.println();
            System.out.println("0 : Want to submit my copies for recheck as a student ");
            System.out.println("1 : Want to publish the modified results after re-examination as an examiner");
            System.out.println("2 : Check Mark");
            System.out.println("3 : Quit Simulation ");
            System.out.print("Enter your choice : ");

            choice = scanner.nextInt();
        }

        return choice;

    }

    public static void driver(iController mediator, Examiner[] examiner,int first, int fullMark, ArrayList<Student>[] list,int stdNum ){

        Scanner scanner = new Scanner(System.in);

        int choice = getChoice();

        if( choice == 0){

            Students_Choice(mediator, examiner,first,stdNum);
        }

        else if( choice == 2){

            int s_ID = 0;

            while(s_ID < first || s_ID >= first + stdNum){

                System.out.print("Provide Your Entire Student id : ");
                s_ID = scanner.nextInt();
                if(s_ID < first || s_ID >= first + stdNum) System.out.println(" Your ID is not there , Sorry.");
            }
            System.out.println("ID : " + s_ID);
            for(int i=0; i< examiner.length; i++) Students_Print(list[i], s_ID, i,first);
        }

        else if(choice == 3){

            System.exit(0);
        }

        else {

            Examiners_Choice(mediator, examiner,first,fullMark,list,stdNum);
        }
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int first = 1905061;

        System.out.print("Enter number of Students: ");
        int stdNum = scanner.nextInt();

        System.out.print("Enter number of Teachers: ");
        int exmNum = scanner.nextInt();

        System.out.print("Enter Exam full Marks: ");
        int fullMarks = scanner.nextInt();


        iController mediator = new Mediator(exmNum);
        Examiner [] examiner = new Examiner[exmNum];
        ArrayList<Student> [] list = new ArrayList[exmNum];
        //recheck_queue = new ArrayList[exmNum];



        for(int i=0;i<exmNum;i++){

            examiner[i] = new Examiner(mediator,i);
            examiner[i].getMediator().registerExaminer(examiner[i]);

            list[i] = new ArrayList<>();

            for(int j=0;j<stdNum;j++){

                list[i].add(new Student(mediator,first+j,i));

            }

            examiner[i].getMediator().addStudentList(list[i]);

            for ( Student e: examiner[i].getMediator().getStudentList(i)) {

                int x = random.nextInt(fullMarks/3,fullMarks-1);
                e.setOldMark(x);
                e.setNewMark(x);

            }

            examiner[i].getMediator().Scrutinize(fullMarks);






        }

        while(true) {
            driver(mediator,examiner,first,fullMarks,list,stdNum);
        }










        //

    }
}