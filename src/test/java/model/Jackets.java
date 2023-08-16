package model;

import java.math.BigDecimal;

public class Jackets {
    private String name;
    private String brand;
    private Boolean gender;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPercentageOfCotton() {
        return percentageOfCotton;
    }

    public void setPercentageOfCotton(Double percentageOfCotton) {
        this.percentageOfCotton = percentageOfCotton;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    private Double percentageOfCotton;
    private BigDecimal price;
    private String season;

}
