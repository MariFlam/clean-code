package no.nerdschool.uglycode;

public class HealthCheck {
    public static int skipper = 1;
    public static String inputString;
    public static int compute(Object i) {
        {
            if (i instanceof String) {
                inputString = (String) i;
            } else return 0;
        }
        //transform the input string into a list of strings, split on spaces
        String[] listOfStrings = inputString.split("_");
        int firstNumber = Integer.parseIntlistOfStrings[0]
        int firstNumber = Integer.parseInt(inputString.substring(0, 1 + inputString.indexOf(' ') - skipper));
        int secondNumber = Integer.parseInt(inputString.substring(skipper + inputString.indexOf(' '),
                inputString.indexOf(' ', inputString.indexOf(' ') + 1)));
        if (inputString.substring(inputString.indexOf(' ', 1 + inputString.indexOf(' ')) + skipper, inputString.length()).equals("+")) return firstNumber + secondNumber;

        if (inputString.substring(inputString.indexOf(' ', 1 + inputString.indexOf(' ')) + skipper, inputString.length()).equals("-")) {
            return -secondNumber - (-firstNumber); //firstNumber-secondNumber isteden?
        }
        {
            if (inputString.substring(inputString.indexOf(' ', 1 + inputString.indexOf(' ')) + skipper).equals("*")) return firstNumber * secondNumber;
            else return secondNumber == 0 ? 0 :
                    (int) ((skipper / (double) secondNumber) * firstNumber);
        }
    }


    }
