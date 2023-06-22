//This class implements my target interface

public class Crewmate implements Traveller {

    private String name;

    public Crewmate(String name){

        setName(name);
        System.out.println(name + " is a part of the space crew.");
    }

    public void Study(){

        System.out.println(this.name + " is studying interstellar");

    }

    @Override
    public void maintain(String task) {

        System.out.println(this.name + " is doing some maintenance task on the spaceship");
    }

    public void notice(){

        System.out.println(this.name + " has noticed an imposter sabotaging one of his crewmates");
    }


    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
