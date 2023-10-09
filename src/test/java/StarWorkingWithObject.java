
import model.other.Transport;
import org.junit.jupiter.api.Test;

public class StarWorkingWithObject {
    @Test
    public void calculation() {
        Transport auto = new Transport();
        auto.setTransportName("Auto");
        auto.setFuelConsumptionPerOneHundredKm(6.5);

        Transport train = new Transport();
        train.setTransportName("Locomotive");
        train.setFuelConsumptionPerOneHundredKm(160);

        Transport airplane = new Transport();
        airplane.setTransportName("Airplane");
        airplane.setFuelConsumptionPerOneHundredKm(294);

        Transport cityOne = new Transport();
        cityOne.setPointOfDeparture("Riga");

        Transport cityTwo = new Transport();
        cityTwo.setArrivalPoint("Barselona");

        Transport autoDistance = new Transport();
        autoDistance.setDistance(3023);

        Transport trainDistance = new Transport();
        trainDistance.setDistance(2333);

        Transport airplaneDistance = new Transport();
        airplaneDistance.setDistance(2868);

        System.out.println("Route:" + " " + cityOne.getPointOfDeparture() + "-" + cityTwo.getArrivalPoint());
        System.out.println("Fuel Consuption");
        System.out.println(auto.getTransportName() + " = " + (autoDistance.getDistance() * auto.getFuelConsumptionPerOneHundredKm() / 100));
        System.out.println(train.getTransportName() + " = " + (trainDistance.getDistance() * train.getFuelConsumptionPerOneHundredKm() / 100));
        System.out.println(airplane.getTransportName() + " = " + (airplaneDistance.getDistance() * airplane.getFuelConsumptionPerOneHundredKm() / 100));

        train.fuelConsumption();
       auto.fuelConsumption();
       airplane.fuelConsumption();



    }}