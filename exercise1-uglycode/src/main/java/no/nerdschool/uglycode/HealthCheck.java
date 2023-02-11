package no.nerdschool.uglycode;

public class HealthCheck {
    public static int skipper = 1;
    public static String inputString;
    public static int compute(Object input) {
        {
            if (input instanceof String) {
                inputString = (String) input;
            } else return 0;
        }
        //need a test to see if the array does indeed have 3 indecies?
        //transform the input string into a list of strings, split on spaces
        String[] listOfStrings = inputString.split(" ");

        //the first number in the list is assigned to the variable firstNumber
        int firstNumber = Integer.parseInt(listOfStrings[0]);
        int secondNumber = Integer.parseInt(listOfStrings[1]);
        String operator = listOfStrings[2];

        if (operator.equals("+")){
            return firstNumber + secondNumber;
        }
        if (operator.equals("-")) {
            return firstNumber-secondNumber;
        }
        if (operator.equals("*")) {
            return firstNumber * secondNumber;
        }
        //if the second number is 0 it returns 0
        // else it returns the second number divided by the first
        else {
            return secondNumber == 0 ? 0 :
                    (int) ((skipper / (double) secondNumber) * firstNumber);
        }
    }
    }
