package com.furniture;

public class furnitureImpl {
    public static void main(String[] args){
        FurnitureItem object = new FurnitureItem();
        object.setFurnitureCode(12345);
        object.setColor("green");
        object.setFurnitureType("chair");
        object.setGradeOfFurniture("grade1");
        object.setFurnitureUsage("outdoor");
        object.setPrice(5000);
        System.out.println(object.getColor());
        System.out.println(object.getFurnitureType());
        System.out.println(object.getFurnitureCode());
        System.out.println(object.getFurnitureUsage());
        System.out.println(object.getGradeOfFurniture());
        System.out.println(object.getPrice());
        System.out.println(object.calculateDiscount());
    }
}
