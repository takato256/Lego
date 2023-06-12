package lejostest;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class testprogram {
	
	public static void main(String[] args) {
		EV3LargeRegulatedMotor wheelLeft = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor wheelRight = new EV3LargeRegulatedMotor(MotorPort.C);
		
		Button.waitForAnyPress();
		
		wheelLeft.rotate(360, true);	// 左右のモーターを同時に動かすようにする
		wheelRight.rotate(360);
	}
}
