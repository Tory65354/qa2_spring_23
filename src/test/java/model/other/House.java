package model.other;

import java.math.BigDecimal;

public class House {
    private String adress;
    private String postcode;
    private int numberOfFloors;
    private float houseHeight;
    private Integer numberOfResident;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public float getHouseHeight() {
        return houseHeight;
    }

    public void setHouseHeight(float houseHeight) {
        this.houseHeight = houseHeight;
    }

    public Integer getNumberOfResident() {
        return numberOfResident;
    }

    public void setNumberOfResident(Integer numberOfResident) {
        this.numberOfResident = numberOfResident;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    private int numberOfApartment;
    private BigDecimal price;
    private float square;

}
