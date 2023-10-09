package model.other;

public class RunningMarathon {
    private  String organizer;
    private String marathonName;
    private int numberOfParticipant;
    private double distance;
    private int averageAge;
    private int numberOfCarEscort;

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getMarathonName() {
        return marathonName;
    }

    public void setMarathonName(String marathonName) {
        this.marathonName = marathonName;
    }

    public Integer getNumberOfParticipants() {
        return numberOfParticipant;
    }

    public void setNumberOfParticipants(Integer numberOfParticipants) {
        this.numberOfParticipant = numberOfParticipants;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(int averageAge) {
        this.averageAge = averageAge;
    }

    public int getNumberOfCarEscort() {
        return numberOfCarEscort;
    }

    public void setNumberOfCarEscorts(int numberOfCarEscorts) {
        this.numberOfCarEscort = numberOfCarEscorts;
    }

    public int getNumberOfPlacesWon() {
        return numberOfPlacesWon;
    }

    public void setNumberOfPlacesWon(int numberOfPlacesWon) {
        this.numberOfPlacesWon = numberOfPlacesWon;
    }

    private int numberOfPlacesWon;


}
