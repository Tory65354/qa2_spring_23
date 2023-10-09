package model.other;

public class Phone {
    private String Brand;
    private String modelName;
    private int year;
    private float RAM;
    private Character cellularTechnology;
    private String operatingSystem;
    private Float screenSize;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRAM() {
        return RAM;
    }

    public void setRAM(float RAM) {
        this.RAM = RAM;
    }

    public Character getCellularTechnology() {
        return cellularTechnology;
    }

    public void setCellularTechnology(Character cellularTechnology) {
        this.cellularTechnology = cellularTechnology;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }
}
