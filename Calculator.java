package Day1.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        List<Integer> negativeNumbers = new ArrayList<Integer>();

        // if (numbersArray.length > 2) {
        // throw new RuntimeException("Up to two numbers separated by a comma allowed");
        // } else {
        // Go through each number in our numbersArray and convert it from a string to an
        // integer
        for (String number : numbersArray) {
            if (!number.isEmpty()) {
                int numberInt = Integer.parseInt(number);
                // If its not possible to convert the item to an integer, parseInt will throw an
                // exception
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                } else {
                    returnValue += numberInt;
                }
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives are not alowed" + negativeNumbers.toString());
        }
        return returnValue;
        // Returns 0 (default value) if no items in array
        // Returns sum of item(s) if 1 or 2 items exist in array
    }
}
