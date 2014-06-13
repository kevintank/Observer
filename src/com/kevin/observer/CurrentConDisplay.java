package com.kevin.observer;

import java.util.Observable;
import java.util.Observer;

import android.util.Log;

public class CurrentConDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		  Log.d("DEBUG", "이건 내장 Observable 사용 한것임 conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub

		if(observable instanceof WeatherData){
			
			WeatherData weatherData = (WeatherData)observable;
			this.temperature = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			
			display();
		}
	}

}
