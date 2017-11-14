
import java.util.Arrays;


//Jack Tan 11/1/17

public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num,strMain, arrMain);
		System.out.println("In Main, num:" + num);
		System.out.println("In Main, strMain:" + strMain);
		System.out.println("In Main, arrMain:" + Arrays.toString(arrMain));
		
	}
	public static void changeMe(int a, String str, int[] arr) {
		System.out.println("In changeNum, after the change, num:" + a);
		a = 5;
		System.out.println("In changeNum, after the change, num:" + a);
		int b = a;
		System.out.println("In changeNum, after the change, num:" + a);
		a = 8;
		
		System.out.println("In changeNum, after the change, strMain:" + str);
		str = "needs help";
		System.out.println("In changeNum, after tihe change, strMain:" + str);
		String newString = str;
		System.out.println("In changeNum, after the change, strMain:" + str);
		
		System.out.println("In changeNum, after the change, arr:" + Arrays.toString(arr));
		arr[0] = 8 ;
		
		
		
		
		
	}
}
	