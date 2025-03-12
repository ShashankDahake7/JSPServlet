package com.myCar;

public class CarsBean implements java.io.Serializable {
    private String carName;
    private String brandName;
    private int price;

    // Default constructor
    public CarsBean() {
    }

    // Getters
    public String getCarName() {
        return carName;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}