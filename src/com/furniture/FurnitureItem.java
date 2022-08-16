package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private double price;
    private static final double DISCOUNT = 5;

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public FurnitureItem() {
        furnitureCode =0;
        furnitureType ="";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0.0;

    }
    public double calculateDiscount(){
        double discountPrice = 0;
        if(getGradeOfFurniture().equals("grade1") || getFurnitureUsage().equals("outdoor"));
        discountPrice =  (DISCOUNT * price)/100;
        return price - discountPrice;

    }


}
