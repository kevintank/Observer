package com.kevin.observer;

import android.util.Log;

/**
 * 하나의 옵져버 
 * 
 * @author Administrator
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		   Log.d("DEBUG", "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		
		display();
           
	}

}
