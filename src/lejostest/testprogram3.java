package lejostest;

import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;

public class testprogram3 {
	public static void main(String[] args) {
		SensorModes colorSensor = new EV3ColorSensor(SensorPort.S2);
		
		SampleProvider colorRGB = colorSensor.getMode("RGB");
		float[] sampleRGB = new float[colorRGB.sampleSize()];
		
		colorRGB.fetchSample(sampleRGB, 0);
		
		System.out.println(sampleRGB);
		Button.waitForAnyPress();
	}
}
