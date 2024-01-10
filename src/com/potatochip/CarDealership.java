package com.potatochip;

import java.util.Arrays;

public class CarDealership {
    private String name;
    private int displayStock;
    private Car[] carsInStock;

    public CarDealership(String name, int displayStock) {
        this.name = name;
        this.displayStock = displayStock;
        this.carsInStock = new Car[displayStock]; //sets count of cars in stock with number of display stock
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplayStock() {
        return displayStock;
    }

    public void setDisplayStock(int displayStock) {
        this.displayStock = displayStock;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }
    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", displayStock=" + displayStock +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }

    public void addCarToStock(Car car){
        int currentStock = getStockCount();
        if(currentStock < displayStock){
            carsInStock[currentStock] = car;
        } else{
            System.out.println("Maximum number of cars at dealership has been reached.");
        }
    }

    public int getStockCount(){
        int count = 0;
        for(Car car: carsInStock){
            if(car != null){
                count++;
            }
        }
        return count;
    }

    public Car findCarByManufacturer(String manufacturer){
        for(Car car : carsInStock){
            if(car != null && car.getManufacturer().equalsIgnoreCase(manufacturer)){
                return car;
            }
        }
        return null;
    }


}
