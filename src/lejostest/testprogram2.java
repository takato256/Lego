package lejostest;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class testprogram2 {

	public static void main(String[] args) {
		
		Button.waitForAnyEvent();
		
		EV3LargeRegulatedMotor wheelLeft = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor wheelRight = new EV3LargeRegulatedMotor(MotorPort.C);
		
		wheelLeft.setSpeed(720);
		wheelRight.setSpeed(360);
		
		wheelLeft.forward();
		wheelRight.forward();
		
		Delay.msDelay(5000);
		
		wheelLeft.stop(true);
		wheelRight.stop();

	}

}
