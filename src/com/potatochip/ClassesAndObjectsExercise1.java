package com.potatochip;

public class ClassesAndObjectsExercise1 {
    public static void main(String[] args){
        CarDealership dealership = new CarDealership("Car Auto", 3);
        dealership.addCarToStock(new Car("Toyota", 35000.0, EngineType.Petrol));
        dealership.addCarToStock(new Car("Honda", 40000.0, EngineType.Hybrid));
        dealership.addCarToStock(new Car("Tesla", 75000.0, EngineType.Electric));
        dealership.addCarToStock(new Car("BMW", 85000.0, EngineType.Petrol));

        Car[] carsInStock = dealership.getCarsInStock();

        for(Car car: carsInStock){
            if (car != null) {
                System.out.println(car.getManufacturer() + " " + car.getEngineType());
            }
        }

        String foundManufacturer = "Honda";
        if(dealership.findCarByManufacturer(foundManufacturer) != null ){
            System.out.println("Car found with manufacturer " + foundManufacturer);
        } else{
            System.out.println("Car with manufacturer '" + foundManufacturer + "' not found in the dealership's stock.");
        }
    }
}
