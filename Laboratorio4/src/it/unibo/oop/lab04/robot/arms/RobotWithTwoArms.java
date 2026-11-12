package it.unibo.oop.lab04.robot.arms;

import it.unibo.oop.lab04.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{
	BasicArm leftarm, rightarm;
	public RobotWithTwoArms(String robotName) {
		super(robotName);
		leftarm = new BasicArm("Left Arm");
		rightarm = new BasicArm ("Right Arm");
	}
	public boolean pickUp() {
		if(leftarm.isGrabbing() && rightarm.isGrabbing())
			return false;
		if(!leftarm.isGrabbing())
			leftarm.pickUp();
		else
			rightarm.pickUp();
		this.consumeBattery(BasicArm.getConsumptionForPickUp());
		return true;
	}
	public boolean dropDown() {
		if(!leftarm.isGrabbing() && !rightarm.isGrabbing())
			return false;
		if(leftarm.isGrabbing())
			leftarm.dropDown();
		else
			rightarm.dropDown();
		this.consumeBattery(BasicArm.getConsumptionForDropDown());
		return true;
	}
	public int getCarriedItemsCount() {
		return (leftarm.isGrabbing() ? 1 : 0) + (rightarm.isGrabbing() ? 1 : 0);
		
	}
}
