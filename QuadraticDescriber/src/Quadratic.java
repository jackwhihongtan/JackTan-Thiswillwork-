
public class Quadratic {
	public static double discriminant (double a, double b, double c) { 
		return b * b - 4 * a * c;
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
				return (Quadratic.round2(squareRoot)); //rounds it to make sure we don't have 3 demical places
	}
	

	public static String quadDescriber(double a, double b, double c) {
		boolean done = false;
		double ycept = 0;
		double xcept1 = 0;
		double xcept2 = 0;
		double discriminant = b * b - 4 * a * c;
		double aos = 0;
		double vertexY = 0;
		String direction = "";
		if (a < 0) {
			direction = "Down";
		} else {
			direction = "Up";
		}
		aos = -1 * b / (2 * a);
		vertexY = (4 * a * c - b * b)/ (4 * a);
		if (discriminant <= 0) {
			String xcept = "None";
		}else {
			xcept1 = (-1 * a + (Quadratic.sqrt(Quadratic.discriminant(a, b, c) / (2 * a)))); //but put discrim in sqrt for the square root  
			xcept2 = (-1 * a - (Quadratic.sqrt(Quadratic.discriminant(a, b, c) / (2 * a))));
		}
		ycept = c;
		return "Opens: " + direction + "/n Axis of Symmetry: " + aos + "/n Vertex: " + "(" +aos + "," + vertexY +")" + "/n x-intercept(s): " + xcept1 + "," + xcept2 + "/n y-intercept: " + ycept +""; 
	}
}	
	

