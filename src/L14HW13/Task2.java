package L14HW13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    //Write a Java program to compare two array lists. Each needs to contains at least 5 elemets
    ArrayList list1;
    ArrayList list2;

    public static void main(String[] args) {
        ArrayList<String> airplanesParameters = new ArrayList<String>();
        airplanesParameters.add("weight");
        airplanesParameters.add("speed");
        airplanesParameters.add("engineType");
        airplanesParameters.add("tonnage");
        airplanesParameters.add("maxAltitude");
        System.out.println(airplanesParameters);
        System.out.println("============================");

        ArrayList<String> carParameters = new ArrayList<String>();
        carParameters.add("weight");
        carParameters.add("speed");
        carParameters.add("engineType");
        carParameters.add("tonnage");
        carParameters.add("transmission");
        System.out.println(carParameters);

        System.out.println(isEquals(airplanesParameters, carParameters));
        airplanesParameters.remove("maxAltitude");
        airplanesParameters.add("transmission");
        System.out.println(airplanesParameters);
        System.out.println(carParameters);
        System.out.println(isEquals(airplanesParameters, carParameters));

        airplanesParameters.remove("transmission");
        airplanesParameters.add("maxAltitude");
        System.out.println(airplanesParameters);
        System.out.println(carParameters);
        System.out.println(isEquals(airplanesParameters, carParameters));

    }

    private static boolean isEquals(ArrayList<String> airplanesParameters, ArrayList<String> carParameters) {
        Collections.sort(airplanesParameters);
        Collections.sort(carParameters);
        boolean result = airplanesParameters.equals(carParameters);
        //System.out.println(result);
        return result;
    }

}

