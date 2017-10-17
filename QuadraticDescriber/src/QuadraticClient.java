//Jack Tan 10/17/17
import java.util.Scanner;

public class QuadraticClient {
	public static void main(String[] args) {
		boolean notDone = false;
		while (notDone == false) {
			Scanner userinput = new Scanner(System.in);
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for coefficients a, b, c: ");
			System.out.print("a:");
			double a = userinput.nextDouble();
			System.out.print("b:");
			double b = userinput.nextDouble();
			System.out.print("c:");
			double c = userinput.nextDouble();
			System.out.println();
			System.out.println("Description of the graph of:");
			System.out.println("y = " + a + "x^2 + " + b + "x + " + c + "");
			System.out.println();
			String result = Quadratic.quadDescriber(a, b, c);
			System.out.println(result);
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String doneyet = userinput.next();
			if (doneyet.charAt(0) == 'q' || doneyet.charAt(0) == 'Q'){
				notDone = true;
			}
		}
	}
}

