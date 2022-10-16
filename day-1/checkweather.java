public class checkweather {
    /**
     * Assume you have access to two boolean variables, isSnowing, and isRaining, and one
     * double variable, temperature. isSnowing is true when it’s snowing and false otherwise,
     * isRaining is true when it’s raining and false otherwise, and temperature gives the outdoor
     * temperature in degrees Fahrenheit. Write code that prints “Let’s stay home.” if it’s raining,
     * snowing, or below 50 degrees Fahrenheit (10 degrees Celsius), and prints “Let’s go out!”
     * otherwise.
     */
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        if (isRaining || isSnowing || temperature < 50) {
            System.out.println("Let’s stay home.");
        } else {
            System.out.println("Let’s go out!");
        }
    }
}


