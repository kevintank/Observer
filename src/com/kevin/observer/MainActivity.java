package com.kevin.observer;

 
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      
    
        Weather weatherData = new Weather();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.sestMeasurements(80, 65, 30.4f);
        weatherData.sestMeasurements(82, 25, 32.4f);
        weatherData.sestMeasurements(70, 45, 10.4f);
        
   
        WeatherData weather  = new WeatherData();
        CurrentConDisplay cd = new CurrentConDisplay(weather);  //���� ��ü�� �Ѱ� �ش�.
        
        weather.setMeasurements(100, 39, 33.4f);
        weather.setMeasurements(200, 29, 32.4f);
        weather.setMeasurements(300, 19, 13.4f);
        
        
    }

 
     
}
