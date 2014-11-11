import java.io.*;

public class Factorial {
 
	public static int factorial(int x) {
    	int f = 1;
    	for (int i = 2; i <= x; i++) {
    		f *= i;
    	}
    	return f;
	}
	
    public static void main(String[] args) {
    	if ((args.length == 0) || (args.length > 1)) {
        	System.out.println("USAGE: java Factorial <natural number>");
        	return;
    	}
    	try {
    		int x = Integer.parseInt(args[0]);
    		if ((x < 0) || (x > 12)) {
				System.out.println("" + x + " is not a natural number or it is too big");
        		return;
    		}
    		System.out.println("" + x + "! = " + factorial(x));
    	} catch (Exception exp) {
    		System.out.println("\"" + args[0] + "\" is not a natural number");
    	}
    }

}
