package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	boolean run = false;
    	while (run = false) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please input the fractions:");
    	String fractions = sc.nextLine();
    	String lastString = Parse(fractions);
    	String answer = produceAnswer(lastString);
    	}	
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	if (input.indexOf('_') != 0) {
    		String[] firstVal = input.split("_");
    		String wholeNum = firstVal[0];
    		
    	}
    	String[] numsOfInts = input.split(" ");
    	int arrlen = numsOfInts.length;
        return numsOfInts[arrlen - 1];
    }
    
    public static String Parse(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String[] lastValue = input.split(" ");
    	int arrlen = lastValue.length;
        return lastValue[arrlen - 1];
    
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
