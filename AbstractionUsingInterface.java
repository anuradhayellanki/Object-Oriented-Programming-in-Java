
/*
*created abstraction package on 30-may-2022
*/
package com.cashapona.oops.abstraction.may30;
/**
 * @author Anuradha
 * create Vehicle interface, can achieve abstraction using interfaces
 */
interface Vehicle {
   /*
    * An interface can't contain concrete methods
    * only have abstract methods
    */
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
  /*
   * to implement interface we use implements keyword
   */
class Bicycle implements Vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed : " + speed + " gear : " + gear);
    }
}
class Bike implements Vehicle {
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed : " + speed+ " gear : " + gear);
    }
 }
public class AbstractionUsingInterface{
	 public static void main (String[] args) {
        // creating an inatance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(30);
        bicycle.applyBrakes(3);
        System.out.println("Bicycle present state :");
        bicycle.printStates();
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(2);
        // doing some operations
        bike.speedUp(20);
        bike.applyBrakes(3);
        System.out.println("Bike present state :");
        bike.printStates();
	    }
	}
