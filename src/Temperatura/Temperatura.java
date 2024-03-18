package Temperatura;

public class Temperatura {
    public double celsiusParaFahrenheit(double temp){
      return temp*1.8 + 32;
    };

    public double fahrenheitParaCelsius(double temp){
        return (temp - 32)/1.8;
    }
}
