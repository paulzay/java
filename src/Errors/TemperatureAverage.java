package Errors;


import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

    /** prints the average temperature from values provided as command-line arguments
     *
     * @param args space-separated list of temperatures
     */
    public static void main(String[] args) {

        List<Integer> recordedTemperaturesInDegreesCelcius=new ArrayList<Integer>();

        // fill the list from values provided as command-line arguments
        for(String stringRepresentationOfTemperature: args) {
            int temperature=Integer.parseInt(stringRepresentationOfTemperature);
            recordedTemperaturesInDegreesCelcius.add(temperature);
        }

        //calculate and print the average temperature
        int averageTemperature=SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
        System.out.println("The average temperature is " + averageTemperature);

    }

}