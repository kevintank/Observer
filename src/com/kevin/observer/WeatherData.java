package com.kevin.observer;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
	}
	
	public void measurementsChanged(){
		
		setChanged();
		notifyObservers();
		
	}

	public void setMeasurements(float temp, float humidity, float presure){
		
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = presure;
		
		measurementsChanged();
		
	}
	
	public float getTemp(){
		
		return temperature;
	}
	
	public float getHumidity(){
		
		return humidity;
	}
	
	public float getPresure(){
		
		return pressure;
	}
}
