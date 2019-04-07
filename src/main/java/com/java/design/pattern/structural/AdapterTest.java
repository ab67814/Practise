package com.java.design.pattern.structural;

public class AdapterTest {

	public static void main(String[] args) {
		MobileDevice mobileDevice = new MobileDevice();
		ChargingAdapter chargingAdapter = new ChargingAdapter();
		chargingAdapter.doChargeDevice(mobileDevice);
		

	}

}
