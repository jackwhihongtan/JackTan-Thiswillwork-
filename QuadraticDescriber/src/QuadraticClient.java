import java.util.Scanner;

public class QuadraticClient {
	public static void main(String[] args) {
		boolean notDone = false;
			while (notDone = false) {
				Scanner userinput = new Scanner(System.in);
				System.out.println("Please type three integers a, b, c: ");
				System.out.println("a");
				int a = userinput.nextInt();
				System.out.println("b:");
				int b = userinput.nextInt();
				System.out.println("c:");
				int c = userinput.nextInt();
				System.out.println("Your equation is ax^2 + bx + c");
				String result = Quadratic.quadDescriber(a, b, c);
				System.out.println("Are you done?");
				String doneyet = userinput.nextLine();
				if (doneyet.charAt(0) == 'q' || doneyet.charAt(0) == 'Q'){
					notDone = true;
				}
			}
		}
	}

