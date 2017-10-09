//Jack Tan, 9/27/17. 2nd Period
// Within this class there are many Math functions

public class Calculate {
	//square the input
		public static int square (int operand) {
			int square = operand * operand; // I tried to compute X^2
			return square;
		}
		public static int cube (int alpha) { //takes one int
			int cube = alpha * alpha * alpha; // = X^3
			return cube; 
		}
		public static double average (double beta1, double beta2) { //can use in stats, takes only 2 values can change for more
			double Totalvalue = beta1 + beta2;
			double Total = Totalvalue / 2; //divides by how many values we have
					return Total;
		}
		public static double average (double kappa1, double kappa2, double kappa3) { // 3 terms accepted
			double Sum = kappa1 + kappa2 + kappa3;
			double allSum = Sum / 3; 
			return allSum; 
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
		public static String toImproperFrac (int a, int b, int c) {
			return ((a * c) + b) + "/" + c; //make sure order of operation is true
		}
		public static String toMixedNum (int a, int b) {
			String answer = a / b + "_" + a % b + "/" + 2; //used "" in order to add that character not to actually divide
			return answer;
		}
		public static String foil (int a, int b, int c, int d) { //do formula (ax + b) (cx + d)
			int first = a * c; 
			int outside = a * d;
			int inside = b *c;
			int last = a * d;
			return (first + "n^2 " + outside + inside + "n" + last); //made sure to add + for the string part
		}
			
		public static boolean isDivisibleBy (int numerator, int denominator) {
			if (numerator % denominator == 0) { //check for remainder if there is none then its divisible
				return true;
			} else {
				return false; 
			}
		}
		public static double absValue (double a) { //simple if it is negative make it positive
			if (a > 0) {
				return a;
			} else { //no need for else if because we have 2 options only
				return a * -1;
			}
		}
	
		public static int absValue (int a) { //for int for part 4
		if (a > 0) {
			return a;
		} else {
			return a * -1;
		}
	}
		public static double max (double a, double b) { //checks for max
			if (a > b) {
				return a;
			} else {
				return b;
			}
		}
		public static double max (double a, double b, double c) { //three values mean more conditions 
			if (a > b && a > c) {
				return a;
			} else if (b > a && b > c){ //used && to save space
				return b;
			} else {
				return c;
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
				if (num < 0) {
					throw new IllegalArgumentException ("Undefined"); //free check because anything less than zero this program execute
				}
				double squareRoot = 1;
					while (squareRoot * squareRoot > (num + .1) || squareRoot * squareRoot < (num - .1)) { 
						while (squareRoot * squareRoot < num) {
							squareRoot = squareRoot + .01; // to make the value in between the require boundary
						}
							if (squareRoot * squareRoot > num) {
									squareRoot = squareRoot - .01;
						}
					}
						return (Calculate.round2(squareRoot)); //rounds it to make sure we don't have 3 demical places
			}
	
			public static String quadform (int num1, int num2, int num3) {
				if (Calculate.discriminant(num1, num2, num3) < 0) {
					throw new IllegalArgumentException ("No real roots"); //tested if discrim is negative because it is not possible
				}
				String answer = "";
					double ans1 = (-1 * num1 + (Calculate.sqrt(Calculate.discriminant(num1, num2, num3) / (2 * num1)))); //but put discrim in sqrt for the square root  
					double ans2 = (-1 * num1 - (Calculate.sqrt(Calculate.discriminant(num1, num2, num3) / (2 * num1)))); //then we need one for + and -
		
						if (ans1 == ans2) {
							return ("\"" + Calculate.round2(ans1) + "\""); //returns one value if both are the same
						}
							else {
								answer =  "\"" + Calculate.round2(ans1) + " and " + Calculate.round2(ans2) + "\""; //returns two different answers 
								return answer; 
						}
				}
	}
