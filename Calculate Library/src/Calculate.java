//Jack Tan, 9/27/17. 2nd Period
// Within this class there are many Math functions

public class Calculate {
	//square the input
		public static int square (int operand) {
			int square = operand * operand; // I tried to compute X^2
			return square;
		}
		public static int cube (int num) { //takes one int
			int cube = num * num * num; // = X^3
			return cube; 
		}
		public static double average (double value1, double value2) { //can use in stats, takes only 2 values can change for more
			double Totalvalue = value1 + value2;
			double average = Totalvalue / 2; //divides by how many values we have
					return average;
		}
		public static double average (double num1, double num2, double num3) { // 3 terms accepted
			double Sum = num1 + num2 + num3;
			double average = Sum / 3; 
			return average; 
		}
		public static double toRadians (double degree) { //From degree to pi
			double radian = ((degree * 3.14159) / 180); 
			return radian;
		}
		public static double toDegrees (double radian) { //opposite function than Radian
			double degree = ((radian * 180) / 3.14159);
			return degree;
		}
		public static double discriminant (double a, double b, double c) { // the discriminant helps tell how many real solutions are there
			return b * b - 4 * a * c; // use in Part4 and only takes doubles
		}
		public static int discriminant (int a, int b, int c) { //overload
			return b * b - 4 * a * c;
		}
		public static String toImproperFrac (int wholenum, int numea, int denom) {
			return ((wholenum * denom) + numea) + "/" + denom; //make sure order of operation is true
		}
		public static String toMixedNum (int noom, int denom) {
			String answer = noom / denom + "_" + noom % denom + "/" + 2; //used "" in order to add that character not to actually divide
			return answer;
		}
		public static String foil (int a, int b, int c, int d, String n) { //do formula (ax + b) (cx + d)
			int first = a * c; 
			int outside = a * d;
			int inside = b *c;
			int last = b * d;
			return (first + "n^2" + " " + " + " + (outside + inside) + "n" + " + " + " " + last); //made sure to add + for the string part
		}
			
		public static boolean isDivisibleBy (int numerator, int denominator) {
			if (numerator % denominator == 0) { //check for remainder if there is none then its divisible
				return true;
			} else {
				return false; 
			}
		}
		public static double absValue (double value) { //simple if it is negative make it positive
			if (value > 0) {
				return value;
			} else { //no need for else if because we have 2 options only
				return value * -1;
			}
		}
	
		public static int absValue (int value) { //for int for part 4
		if (value > 0) {
			return value;
		} else {
			return value * -1;
		}
	}
		public static double max (double num1, double num2) { //checks for max
			if (num1 > num2) {
				return num1;
			} else {
				return num2;
			}
		}
		public static double max (double value1, double value2, double value3) { //three values mean more conditions 
			if ( value1 > value2 && value1 > value3) {
				return value1;
			} else if (value2 > value1 && value2 > value3){ //used && to save space
				return value2;
			} else {
				return value3;
			}
		}
			public static int min (int first, int second) { //opposite of max
				if (first < second) {
					return first;
				} else {
					return second;
				}
			}
			public static double min (double num1, double num2) { //overload: double
				if (num1 < num2) {
					return num1;
				} else {
					return num2;
				}
			}

			public static double round2 (double x) {
				double x_hundred = x * 100; //shift x two decimals to right
				double hundred = x_hundred % 1;
				double round = (x_hundred - hundred); // takes out the same numbers and leave the thousands place we need
					if (hundred >= 0.5) { //test for if we need to increment
						round += 1;
					} else if (hundred <= -0.5) { //test for if we need to decrement
						round -= 1;
					}
					double rounded = round/100; //moves the value 2 places back to the left
						return rounded;
			}
	
			public static double exponent (double base, int power) {
				double var = 1; 
					for (int i = 0; i < power; i++) { //no need for <= because it would add another time for loop and mess up the method
						var *= base;	//basically multiples with itself until loop finsihes
					}
						return var;
			}

			public static int factorial (int operand) {
				int fact = 1;
				int i = 1;
					for(i=1; i <= operand; i++) { //needs equal because it adds the value until
						fact = fact * i;
					}
						return fact;
	
			}
			public static boolean isPrime (int number) {
				// test if the int is a divisible by 1 and it self
					boolean prime = true;
						for (int i = 2; i < number; i++) {
							if (Calculate.isDivisibleBy(number, i) == true) { //called for divisibleby to test value
								return false;
							}
						}
						return prime; 
			}
	
			public static int gcf (int a, int b) {
				if (a == 0 || b == 0) {
					throw new IllegalArgumentException ("0");
				}
					a = Calculate.absValue (a); //made values positive to make method work
					b = Calculate.absValue (b);
						while (a != 0 && b !=0 ) { //test for both zero for efficiency of code
							int c = b;  //declare new variable 
							b = a%b;
							a = c;
						}
							return a + b;
			}
			
			public static double sqrt (double num) {
				if (num == 0) {
					return 0;
				}
				double t = 0;
				
				double squareRoot = num / 2;
				do {
						t = squareRoot;
						squareRoot = (t + (num / t)) / 2;
				} while ((t - squareRoot) != 0);
				return squareRoot;
						
				}
	
			public static String quadForm (int num1, int num2, int num3) {
				if (Calculate.discriminant(num1, num2, num3) < 0) {
					return "no real roots"; //tested if discrim is negative because it is not possible
				}
				String answer = "";
					double ans1 = ((-num2 + (Calculate.sqrt(Calculate.discriminant(num1, num2, num3)))) / (2 * num1)); //but put discrim in sqrt for the square root  
					double ans2 = ((-num2 - (Calculate.sqrt(Calculate.discriminant(num1, num2, num3)))) / (2 * num1)); //then we need one for + and -
					System.out.println(Calculate.sqrt(Calculate.discriminant(num1, num2, num3)));
						if (ans1 == ans2) {
							return ("\"" + Calculate.round2(ans1) + "\""); //returns one value if both are the same
						}
							else {
								answer =  "\"" + Calculate.round2(ans1) + " and " + Calculate.round2(ans2) + "\""; //returns two different answers 
								return answer; 
			}
		}
	}
