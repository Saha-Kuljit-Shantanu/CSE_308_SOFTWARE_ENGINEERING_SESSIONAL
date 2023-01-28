public class CarFactory {

    public Car getCar(String continent){

        if(continent == null) return null;

        if(continent.trim().equalsIgnoreCase("Europe")) return new BMW();

        if(continent.trim().equalsIgnoreCase("Asia")) return new Toyota();

        if(continent.trim().equalsIgnoreCase("United States")) return new Tesla();

    return null;

    }

}
