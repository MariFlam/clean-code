package no.nerdschool.uglycode;

public class HealthCheck {
    public static int skipper = 1;
    public static String c;
    public static int compute(Object i) {
        {
            if (i instanceof String) {
                c = (String) i;
            } else return 0;
        }
        int x = Integer.parseInt(c.substring(0, 1 + c.indexOf(' ') - skipper));
        int jeff = Integer.parseInt(c.substring(skipper + c.indexOf(' '),
                c.indexOf(' ', c.indexOf(' ') + 1)));
        if (c.substring(c.indexOf(' ', 1 + c.indexOf(' ')) + skipper, c.length()).equals("+")) return x + jeff;

        if (c.substring(c.indexOf(' ', 1 + c.indexOf(' ')) + skipper, c.length()).equals("-")) {
            return -jeff - (-x); //x-jeff isteden?
        }
        {
            if (c.substring(c.indexOf(' ', 1 + c.indexOf(' ')) + skipper).equals("*")) return x * jeff;
            else return jeff == 0 ? 0 :
                    (int) ((skipper / (double) jeff) * x);
        }
    }


    }
}
