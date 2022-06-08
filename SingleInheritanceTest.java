package com.cashapona.oops.inheritance.may31;
/**
 * @author Anuradha
 * parent class Bicycle
 */
class Bicycle {
    /*
     *  the Bicycle class has two fields gear , speed
     */
    private int gear;
    private int speed;
     /*
     *  constructor for parent class Bicycle
     *  @params gear,speed
     */
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
     /*
     *  toString() method return info of Bicycle
     */
    public String toString()
    {
        return ("No of gears are " + gear + "\n"+ "speed of bicycle is " + speed);
    }
}
 /*
  *  derived class MountainBike declaration
  */
class MountainBike extends Bicycle {
    public int seatHeight;
    /*
     * constructor for MountainBike
     * @params gear,speed, startHeight
     */
    public MountainBike(int gear, int speed,int startHeight)
    {
        // invoking base-class(Bicycle) constructor with super keyword
        super(gear, speed);
        seatHeight = startHeight;
    }
    // overriding toString() method of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
/**
 * @param args
 */
public class SingleInheritanceTest {
    public static void main(String args[])
    {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
	
	
