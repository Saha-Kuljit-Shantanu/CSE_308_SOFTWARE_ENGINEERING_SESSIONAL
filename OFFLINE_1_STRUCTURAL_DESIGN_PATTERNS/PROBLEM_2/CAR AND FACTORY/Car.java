public class Car implements Model,Color,Country,Engine,DriveTrain{

    private String name;
    private String color;
    private String country;
    private String engine;
    private String wheel;



    @Override
    public void setName(String name){

        this.name = name;
    }

    @Override
    public String getName(){

        return this.name;
    }

    @Override
    public void setColor(String color){

        this.color = color;
    }

    @Override
    public String getColor(){

        return this.color;
    }

    @Override
    public void setCountry(String country){

        this.country = country;
    }

    @Override
    public String getCountry(){

        return this.country;
    }

    @Override
    public void setEngine(String engine){

        this.engine = engine;
    }

    @Override
    public String getEngine(){

        return this.engine;
    }

    @Override
    public void setDriveTrain(String wheel){

        this.wheel = wheel;
    }

    @Override
    public String getDriveTrain(){

        return this.wheel;
    }
}




