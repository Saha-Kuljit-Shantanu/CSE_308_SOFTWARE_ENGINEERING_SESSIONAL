// We are implementing our scenario here

import java.util.ArrayList;

public class Scenario {

    public static void main(String[] args) {

        //ArrayList<Crewmate> crewMateList = new ArrayList<>();
        ArrayList<Imposter> imposterList = new ArrayList<>();
        //ArrayList<Pretend>travellerList = new ArrayList<>();
        ArrayList<Traveller> travellerList = new ArrayList<>();

        travellerList.add(new Crewmate("Monica"));
        travellerList.add(new Crewmate("Chandler"));
        travellerList.add(new Crewmate("Ross"));

        imposterList.add(new Imposter("Joey"));
        imposterList.add(new Imposter("Phoebe"));
        imposterList.add(new Imposter("Rachel"));

        for (Imposter i : imposterList) {

            travellerList.add(new Pretend(i));

        }

        // Crewmate Parameters
        travellerList.get(0).Study();
        travellerList.get(0).maintain("p");
        travellerList.get(1).notice();


        //Imposter Parameters
        travellerList.get(4).maintain("p");
        travellerList.get(3).maintain("dss");
        travellerList.get(5).maintain("d");

        //Notice
        travellerList.get(5).notice();
        travellerList.get(2).notice();

        //Study
        travellerList.get(3).Study();
        travellerList.get(1).Study();







    }
}
