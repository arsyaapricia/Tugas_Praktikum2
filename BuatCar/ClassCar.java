/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum2;

import TugasPraktikum2.Interface.CarBehavior;

/**
 *
 * @author User
 */
public class ClassCar implements CarBehavior {
     
    private String color;
    private String noPlate;
    private double width;
    private double height;
    private String brand;
    
    
    public ClassCar (){
        this.color = "Putih";
        this.noPlate = "B 0000 XYZ";
        this.width = 1.8;
        this.height = 1.5;
        this.brand = "Honda";
    }
    
    public ClassCar(String color, String noPlate, double width, double height, String brand) {
        this.color = color;
        this.noPlate = noPlate;
        this.width = width;
        this.height = height;
        this.brand = brand;
    }
 
    @Override
    public void startEngine() {
        System.out.println("Engine started for " + brand + " with plate " + noPlate);
    }
    
   
    @Override
    public void throttle() {
        System.out.println("Car is accelerating");
    }
    
    @Override
    public void brake() {
        System.out.println("Brakes applied");
    }
    
    @Override
    public void turnOnHeadLamp() {
        System.out.println("Head lamp turned on");
    }
    
    @Override
    public void turnOffHeadLamp() {
        System.out.println("Head lamp turned off");
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getNoPlate() {
        return noPlate;
    }
    
    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
  
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Plate: " + noPlate);
        System.out.println("Dimensions: " + width + "m x " + height + "m");
    }
}

