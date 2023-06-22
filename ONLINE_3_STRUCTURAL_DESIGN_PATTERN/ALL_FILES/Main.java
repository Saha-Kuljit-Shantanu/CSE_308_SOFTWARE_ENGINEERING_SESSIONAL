import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Select OS for Phone");//0 for windows 1 for linux

        int choice;

        Scanner scanner = new Scanner(System.in);

        choice = scanner.nextInt();

        if(choice == 0) {
            OS os = new Windows(new SmartPhone());
            os.task();
        }
        else {

            OS os = new Linux(new SmartPhone());
            os.task();
        }

        System.out.println("Select OS for Booke");//0 for windows 1 for linux

        choice;

       scanner = new Scanner(System.in);

        choice = scanner.nextInt();

        if(choice == 0) {
            OS os = new Windows(new NoteBook());
            os.task();
        }
        else {

            OS os = new Linux(new SmartPhone());
            os.task();
        }


    }
}
