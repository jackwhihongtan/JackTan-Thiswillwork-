
public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num,strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain);
		
	}
	public static void changeMe(int a, String str, int[] arr) {
		a = 5;
		int b = a;
		a = 8;
		System.out.println(a + " and " +  b);
		
		String start = str + "needs help";
		String newB = start;
		String Value = str + "needs help help";
		System.out.println(Value + " and " +  newB);
		
		arr[0] = 8 ;
		int c = arr[0];
		arr[0] = 6;
		System.out.println(arr[0] + " and " + c);
		
		
		
		
		
	}
}
	