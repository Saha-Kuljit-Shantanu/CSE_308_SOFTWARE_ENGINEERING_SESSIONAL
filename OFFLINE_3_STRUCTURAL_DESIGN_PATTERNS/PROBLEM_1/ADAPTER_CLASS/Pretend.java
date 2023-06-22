

public class Pretend implements Traveller {

    Imposter imp ;

    Pretend(Imposter imp){

        this.imp = imp;
    }

    @Override
    public void Study() {

        System.out.println(imp.getName() +  ": But see they don't know that we know they know we know");
    }

    @Override
    public void notice() {

        System.out.println(imp.getName() + " pretends to notice an imposter and reports one of the crewmates to get it kicked out of the spaceship");
    }

    @Override
    public void maintain(String task) {

        this.imp.Sabotage(task);
    }
}
