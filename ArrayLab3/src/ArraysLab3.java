//Jack Tan
import java.util.Arrays;

public class ArraysLab3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(remove(arr, 2)));
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int arrlen = arr1.length;
		int[] arr3 = new int[arrlen];
		for (int i = 0; i < arrlen; i++) {
			arr3[i]  = arr1[i] + arr2[i];
		}
		return arr3;
	}
	public static int[] append(int[] arr, int num) {
		int arrlen =arr.length + 1;
		int[] arrappend = new int[arrlen];
		for( int i = 0; i < arrlen-1; i++) {
			arrappend[i] = arr[i];
		}
		arrappend[arrlen-1] = num;
		return arrappend;
	}
	public static int[] remove(int[] arr, int idx) {
		int arrlen = arr.length-1;
		int[] arrRemove = new int[arrlen];
			for(int i = 0; i < idx;i++) {
				arrRemove[i] = arr[i];
			}

			for( int k = idx; idx < arrlen - 1; k++) {
				System.out.println(arr[k + 1]);
				System.out.println(k);
				arrRemove[k] = arr[k+1];
				
			}
				
			return arrRemove;
	}

	public static int sumEven(int[] arr) {
		int sum = 0;
		int arrlen = arr.length;
			for (int i = 0; i < arrlen; i += 2) {
				sum += arr[i];
			}
		return sum;
	}
	public static void rotateRight (int[] arr) {
		int arrlen = arr.length;
		int lastnum = arr[arrlen-1];
			for(int i = arrlen - 1; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = lastnum;
	}
}

