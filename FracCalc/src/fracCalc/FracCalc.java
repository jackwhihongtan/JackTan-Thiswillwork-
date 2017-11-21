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
    	String answer = produceAnswer(fractions);
    	System.out.println(answer);
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
		int[] fraction1 = toImproperFrac(splitOper(Oper1(Parse((fractions)))));
		int[] fraction2 = toImproperFrac(splitOper(Oper2(Parse((fractions)))));
		String[] operator = Parse(fractions);
		String operatorSign = operator[1];
		int[] answer = new int[3];
		if (operatorSign.equals("+")) {
				addition(fraction1, fraction2);
				return " " + answer[1] + " / " + answer[2] + "";
		} else if(operatorSign.equals("-")) {
			fraction2[2] = fraction2[1] * -1;
			addition(fraction1, fraction2);
			return " " + answer[1] + " / " + answer[2] + "";
			} else if(operatorSign.equals("/")) {
				int switchNum = fraction2[2];
		    	fraction2[2] = fraction2[1];
		    	fraction2[1] = switchNum;
				multiply(fraction1, fraction2);
				return " " + answer[1] + " / " + answer[2] + "";
			} else {
				multiply(fraction1, fraction2);
				return " " + answer[1] + " / " + answer[2] + "";
			}
		}
    
    
    public static String[] Parse(String Parse)
    { 
        // TODO: Implement this function to produce the solution to the Parse
    	// Parse Both functions
    	String[] lastValue = Parse.split(" ");
        return lastValue;
    // TODO: Fill in the space below with any helper methods that you think you will need
    }
    public static int[] toImproperFrac (int[] fraction) {
    	fraction[1] = ((fraction[0] * fraction[2]) + fraction[1]);
    	fraction[0] = 0;
    	return fraction; //make sure order of operation is true
    }
    public static int[] addition(int[] fraction1, int[] fraction2) {
    	fraction1[1] = (fraction1[1] * fraction2[2]);
    	fraction2[1] = (fraction2[1] * fraction1[2]);
    	fraction1[2] = (fraction1[2] * fraction2[2]);
    	fraction1[0] = fraction1[1] + fraction1[2];
    	int[] answer = {0,fraction1[0], fraction1[2]};
    	return answer;
    }
    public static int[] multiply(int[] fraction1, int[] fraction2) {
    	fraction1[0] = fraction1[1] * fraction2[1];
    	fraction2[0] = fraction1[2] * fraction2[2];
    	int[] answer = {0,fraction1[0], fraction2[0]};
    	return answer;
    
    }
}

