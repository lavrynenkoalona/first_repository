package L13HW12;

public class Task2 {
    //Write program which has method isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny).
    // In this method you have to verify variables and if it’s raining,
    // temperature is below 10, and is not sunny then throw Exception("Weather is not good")
    public static void main(String[] args) {
        try {
            System.out.println("isWeatherGood = " + isWeatherGood(8, false, true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean isWeatherGood(int temperature, boolean isItSunny, boolean isItRaining) throws Exception {

        if ((isItRaining) || (isItSunny) || (temperature < 10)) {
            throw new Exception("Weather is not good");
        } else {
           return true;
        }

    }
}
