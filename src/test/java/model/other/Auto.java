package model.other;

import java.math.BigDecimal;

public class Auto {
    private String carBrand;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getWorldRating() {
        return worldRating;
    }

    public void setWorldRating(double worldRating) {
        this.worldRating = worldRating;
    }

    private String model;
    private int year;
    private String color;
    private long mileage;
    private BigDecimal price;
    private double worldRating;

    public void descriptionOfCar () {
        System.out.println(carBrand + " " + model + "(" + year + ")") ;
    }

}
