package it.unibo.oop.lab04.robot.arms;

public class BasicArm {
    private static final double GRABBING_DELTA = 0.5;
    private static final double DROPPING_DELTA = 0.3;
	private String name;
	private boolean grabbing;
	 public BasicArm(String name) {
	  this.name = name;
	 }
	 
	 public static double getConsumptionForPickUp() {
		 return GRABBING_DELTA;
	 }
	 public static double getConsumptionForDropDown() {
		 return DROPPING_DELTA;
	 }
	 
	 boolean isGrabbing() {
		 return grabbing;
	 }
	 void pickUp() {
		 grabbing = true;
		 
	 }
	 void dropDown() {
		grabbing = false;
	 }

	 public String toString() {
		return "BasicArm [name=" + name + ", grabbing=" + grabbing + "]";
	 }
}
