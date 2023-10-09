package model.other;

public class Transport {
    private String transportName;
    private float fuelConsumptionPerOneHundredKm;
    private String pointOfDeparture;
    private String arrivalPoint;
    private double distance;

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public double getFuelConsumptionPerOneHundredKm() {
        return fuelConsumptionPerOneHundredKm;
    }

    public void setFuelConsumptionPerOneHundredKm(float fuelConsumptionPerOneHundredKm) {
        this.fuelConsumptionPerOneHundredKm = fuelConsumptionPerOneHundredKm;
    }

    public void setDistance(double distance) {
        this.distance = distance;

    }

    public void setFuelConsumptionPerOneHundredKm(double fuelConsumptionPerOneHundredKm) {
        this.fuelConsumptionPerOneHundredKm = (float) fuelConsumptionPerOneHundredKm;
    }


    public String getPointOfDeparture() {
        return pointOfDeparture;
    }

    public void setPointOfDeparture(String pointOfDeparture) {
        this.pointOfDeparture = pointOfDeparture;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void fuelConsumption() {
        System.out.println(distance * fuelConsumptionPerOneHundredKm / 100);
    };

    }
