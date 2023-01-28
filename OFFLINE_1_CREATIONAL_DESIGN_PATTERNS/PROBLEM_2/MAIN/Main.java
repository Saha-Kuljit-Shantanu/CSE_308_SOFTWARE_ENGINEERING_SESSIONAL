import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        CarFactory cf = new CarFactory();

        System.out.print("ENTER CONTINENT : ");

        Scanner scanner = new Scanner(System.in);

        Car car = cf.getCar(scanner.nextLine());

        System.out.println();

        System.out.println("YOUR RESULTS    :");

        System.out.println();

        System.out.println("MODEL           : "+ car.getName());
        System.out.println("COLOR           : "+ car.getColor());
        System.out.println("COUNTRY         : "+ car.getCountry());
        System.out.println("ENGINE          : "+ car.getEngine());
        System.out.println("DRIVE TRAIN     : "+ car.getDriveTrain());

    }


}