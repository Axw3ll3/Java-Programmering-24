public class E3Main {
    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.JagerAirplane.maxPassengerCount = 12;
        airport.JagerAirplane.nosToTailLength_metres = 42.3;
        airport.JagerAirplane.model = "Jagerairplane 42";

        System.out.println("Welcome to " + airport.name);
        System.out.println("The following planes are in the airport: ");

        System.out.println(airport.JagerAirplane.model);
        System.out.println(airport.JasAirplane.model);

        Airplane airbus = new Airplane();
        airbus.maxPassengerCount = 544;
        airbus.nosToTailLength_metres = 72.7;
        airbus.model = "Airbus A380";

        Airplane anotherJasAirplane = airport.JagerAirplane;
        
        System.out.println(airbus.model);
        System.out.println(anotherJasAirplane);

        airport.JagerAirplane.model = "Jas Gripen 39";

        System.out.println(airport.JagerAirplane.model);
        System.out.println(anotherJasAirplane.model);

    }
}
