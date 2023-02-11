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
        //String[] stringToList = inputString.split("_");
        int x = Integer.parseInt(inputString.substring(0, 1 + inputString.indexOf(' ') - skipper));
        int jeff = Integer.parseInt(inputString.substring(skipper + inputString.indexOf(' '),
                inputString.indexOf(' ', inputString.indexOf(' ') + 1)));
        if (inputString.substring(inputString.indexOf(' ', 1 + inputString.indexOf(' ')) + skipper, inputString.length()).equals("+")) return x + jeff;

        if (inputString.substring(inputString.indexOf(' ', 1 + inputString.indexOf(' ')) + skipper, inputString.length()).equals("-")) {
            return -jeff - (-x); //x-jeff isteden?
        }
        {
            if (inputString.substring(inputString.indexOf(' ', 1 + inputString.indexOf(' ')) + skipper).equals("*")) return x * jeff;
            else return jeff == 0 ? 0 :
                    (int) ((skipper / (double) jeff) * x);
        }
    }


    }
