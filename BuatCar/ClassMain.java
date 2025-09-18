/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPraktikum2;

/**
 *
 * @author User
 */
public class ClassMain {
    public static void main(String[] args) {
       
        ClassCar defaultCar = new ClassCar();
        ClassCar customCar = new ClassCar("Red", "D 1234 ABC", 1.9, 1.6, "Honda");
      
        System.out.println("=== DEFAULT CAR ===");
        defaultCar.displayInfo();
        System.out.println("\n=== CUSTOM CAR ===");
        customCar.displayInfo();
        
        // Test methods
        System.out.println("\n=== TESTING DEFAULT CAR METHODS ===");
        defaultCar.startEngine();
        defaultCar.throttle();
        defaultCar.turnOnHeadLamp();
        defaultCar.brake();
        defaultCar.turnOffHeadLamp();
        
        System.out.println("\n=== TESTING CUSTOM CAR METHODS ===");
        customCar.startEngine();
        customCar.throttle();
        customCar.turnOnHeadLamp();
        customCar.brake();
        customCar.turnOffHeadLamp();
        
        // Test setters
        System.out.println("\n=== AFTER MODIFYING DEFAULT CAR ===");
        defaultCar.setColor("Blue");
        defaultCar.setNoPlate("B 5678 DEF");
        defaultCar.displayInfo();
 
    }
    
}
