package fracCalc;

import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {
	
	public static void main(String[] args) 
    {
        // TODO: Read the Parse from the user and call produceAnswer with an equation
    	boolean run = true;
    	while (run = true) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please input the fractions:");
    	String fractions = sc.nextLine();
    	String[] lastvalue = Parse(fractions);
    	int firstTerm[] = (splitOper(Oper1(lastvalue)));
    	int SecondTerm[] = (splitOper(Oper2(lastvalue)));
    	System.out.println("Are you done yet?");
    	String finish = sc.next();
    	
    	if (finish.equals("quit")) {
    		run = false;
    		System.out.println("Thank you");
    	} else {
    		run = true;
    		}
    	}	
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'Parse' and produces the result
    //
    // Parse is a fraction string that needs to be evaluated.  For your program, this will be the user Parse.
    //      e.g. Parse ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String Oper1(String[] lastvalue) {
    	String oper1 = lastvalue[0];
    	return oper1;
    }
    
    public static String Oper2(String[] lastvalue) {
    	int arrlen = lastvalue.length;
    	String oper2 = lastvalue[arrlen - 1];
    	return oper2;
    }
    
    public static int[] splitOper(String input) {
    	
     	int[] operon = new int[3];
     	
     	if (input.indexOf('_') != -1) {
     		operon[0] = Integer.parseInt(input.substring(0,input.indexOf("_")));
     			if(input.indexOf('/') != -1) {
     				operon[1] = Integer.parseInt(input.substring(input.indexOf("_") + 1, input.indexOf("/")));
     				operon[2] = Integer.parseInt(input.substring(input.indexOf("/") + 1));
     		}
     		return operon;
     	}
     	else if(input.indexOf('/') != -1) {
     		operon[0] = 0;
     		operon[1] = Integer.parseInt(input.substring(0, input.indexOf("/")));
     		operon[2] = Integer.parseInt(input.substring(input.indexOf("/") + 1));
     		return operon;
     	} else {
     		operon[0] = Integer.parseInt(input.substring(0));
     		operon[1] = 0;
     		operon[2] = 1;
     		return operon;
     	}
     }
    
	public static String produceAnswer(String fractions) { 
		if (fractions.indexOf("+") != -1) {
			//make an addition method
		}
    }
    
    public static String[] Parse(String Parse)
    { 
        // TODO: Implement this function to produce the solution to the Parse
    	// Parse Both functions
    	String[] lastValue = Parse.split(" ");
    	int arrlen = lastValue.length;
        return lastValue;
    // TODO: Fill in the space below with any helper methods that you think you will need
    }
    public static int[] toImproperFrac (int[] fraction) {
    	fraction[1] = ((fraction[0] * fraction[2]) + fraction[1]);
    	return fraction; //make sure order of operation is true
    }
    public static int[] addition(int[] fraction, int[] fraction2) {
    	fraction[0] = (fraction[0] * fraction2[])
    }
}
