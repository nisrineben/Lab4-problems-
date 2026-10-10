package recordemo;

public class Main{
    public static void main(String[] args) {
        WeatherData TodayWeather=new WeatherData(25,"Sunny");
        WeatherData YesterdayWeather=WeatherData.fromFahrenheit(50,"Sunny");
        System.out.println("Today's weather:"+TodayWeather.getSummary());
        System.out.println("Yesterday's weather:"+YesterdayWeather.getSummary());
    }
}
