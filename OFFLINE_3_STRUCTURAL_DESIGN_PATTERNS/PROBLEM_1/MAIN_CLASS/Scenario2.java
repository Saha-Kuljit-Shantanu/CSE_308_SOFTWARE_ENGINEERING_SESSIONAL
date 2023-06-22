import java.util.Random;

public class Scenario2 {



    public static void main(String[] args) {

        Traveller[] travellers = new Traveller[6];
        String[] names = {"Joey", "Phoebe","Rachel","Ross","Monica","Chandler"};

        Random random = new Random();
        int x;

        for(int i =0;i<6;i++){

            x = random.nextInt(2);
            if(x == 0){

                travellers[i] = new Pretend(new Imposter(names[i]));
            }

            else travellers[i] = new Crewmate(names[i]);
        }

        System.out.println();

        // Study
        for(int i =0;i<6;i++){

            travellers[i].Study();
        }

        System.out.println();

        //Maintain
        for(int i =0;i<6;i++){

            x = random.nextInt(3);
            if(x == 0) travellers[i].maintain("p");
            else if(x == 1) travellers[i].maintain("dss");
            else travellers[i].maintain("d");

        }

        System.out.println();

        //Notice
        for(int i =0;i<6;i++){

            travellers[i].notice();
        }



    }
}
