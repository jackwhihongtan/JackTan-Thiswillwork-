package fracCalc;

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
    	String firstTerm = (splitOper(Oper1(lastvalue)));
    	String SecondTerm = (splitOper(Oper2(lastvalue)));
    	System.out.println(firstTerm);
    	System.out.println(SecondTerm);
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
    
    public static String splitOper(String input) {
    	String numerator = "";
     	String denominator = "";
     	
     	if (input.indexOf('_') != -1) {
     		String wholeNum = input.substring(0,input.indexOf("_"));
     			if(input.indexOf('/') != -1) {
     				numerator = input.substring(input.indexOf("_") + 1, input.indexOf("/"));
     				denominator = input.substring(input.indexOf("/") + 1);
     		}
     			String answer = "whole:"+ wholeNum +" numerator:"+ numerator + " denominator:"+ denominator +"";
     		return answer;
     	}
     	else if(input.indexOf('/') != -1) {
     		String wholeNum = "0";
     		numerator = input.substring(0, input.indexOf("/"));
     		denominator = input.substring(input.indexOf("/") + 1);
     		String answer = "whole:"+ wholeNum +" numerator:"+ numerator + " denominator:"+ denominator +"";
     		return answer;
     	} else {
     		String wholeNum = input;
     		numerator = "0";
     		denominator = "1";
     		String answer = "whole:"+ wholeNum +" numerator:"+ numerator + " denominator:"+ denominator +"";
     		return answer;
     	}
     }
    
	public static String produceAnswer(String input)
    { 
		
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
}
