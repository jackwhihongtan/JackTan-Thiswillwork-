
	import java.util.Scanner;

	public class Gettingnumber {
		public static void main(String[] args) {
		    int smallest = 0;
		    int large = 0;
		    int sum = 0;
		    int num = 0;
		    int bigEven = 0;//Don't forget to add the max of the even numbers!
		    	System.out.println("Enter how many numbers you are calculating:");
		    		Scanner input = new Scanner(System.in);
		    			int n = input.nextInt();//Might want to reorganize the user input so that another coder can understand which input goes into which variable. 
		    			num = input.nextInt();
		    			smallest = num; 
		    				for (int i = 2; i < n; i++) {
		    					num = input.nextInt();
		    					bigEven = num;
		    					if (num > large) {
		    						large = num;
		    					}
		       
		    					else {
		    						smallest = num;
		    					}
		    					if (num % 2 == 0) {
		    						sum += num;
		    						bigEven = num;
		    					}
		    				}if (bigEven > num) {
		    						bigEven = bigEven;
		    				} else { bigEven = num;
		    						}					
		    
		    System.out.println("The largest number is:" + large);
		    System.out.println("Smallest number is : " + smallest);
		    System.out.println("The sum of the even numbers is" + sum);
		    System.out.println("The largest even number is" + bigEven);
		}
	}
