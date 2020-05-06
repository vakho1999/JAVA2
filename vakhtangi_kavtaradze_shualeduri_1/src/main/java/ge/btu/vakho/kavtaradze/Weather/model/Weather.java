package ge.btu.vakho.kavtaradze.Weather.model;


import ge.btu.vakho.kavtaradze.Weather.main.DirectionType;
import ge.btu.vakho.kavtaradze.Weather.main.Singlton;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {


    public String city;
    public String Temperature;
    public String Humidity;
    public String Pressure;
    public DirectionType Wind_Direction;
    public String Wind_Speed;
    public Weather(){

    }
    public Weather(String city,String Temperature,
                   String Humidity,String Pressure,DirectionType Wind_Direction,String Wind_Speed
                   ){
        this.city=city;
        this.Temperature=Temperature;
        this.Humidity = Humidity;
        this.Pressure=Pressure;
        this.Wind_Direction=Wind_Direction;
        this.Wind_Speed = Wind_Speed;

    }



//    public double getWeather(float amou) {
//
//        return  amou / sell;
//    }

//    public String getWeatherbycity(String city) {
//
//        return city;
//    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "{" +
                "'cityName':" + '"'+city +'"'+
                ", 'temperature':'" + '"'+Temperature + '"'+'\'' +
                ", 'humadity':" + '"'+Humidity + '"'+'\'' +
                ", 'Pressure':" + '"'+Pressure + '"'+'\'' +
                ", 'windDirection':" + '"'+Wind_Direction + '"'+'\'' +
                ", 'windSpeed':" + '"'+Wind_Speed + '"'+
                '}';
    };

}


