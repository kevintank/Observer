package com.kevin.observer;

import java.util.ArrayList;

public class Weather implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public Weather() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		 
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		 
		int i = observers.indexOf(o);
		if( i >= 0){
			
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		 
		for(int i=0; i<observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void sestMeasurements(float temperature, float humidity, float pressure){
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
		
	}
	
}
