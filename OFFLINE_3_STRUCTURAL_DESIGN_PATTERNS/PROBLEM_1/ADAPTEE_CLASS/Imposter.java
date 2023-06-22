//The imposters wants to pretend maintenance

public class Imposter  {

    private String name;

    public Imposter(String name){

        setName(name);
        System.out.println("Actually " +  this.name+ " is an imposter. " );
        System.out.println("But Crewmates don't know about this. Only the other imposters do.");
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void Sabotage(String task){

        if(task.equalsIgnoreCase("p")) System.out.println(this.name + " is poisoning a crewmate");
        if(task.equalsIgnoreCase("dss")) System.out.println(this.name + " is damaging the spaceship");
        if(task.equalsIgnoreCase("d")) System.out.println(this.name + " is develeoping a device to destroy the spaceship");

    }
}
