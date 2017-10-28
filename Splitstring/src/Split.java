import java.util.Arrays;
//Jack Tan 10/28/17


public class Split {
	public static void main(String[] args) {
		String[] original = Getthefilling ("applespineapplesbreadlettusbreadtomatobaconmayohambreadcheese");
		System.out.println(Arrays.toString(original));
	}	
	//precode for part 1
			// make a method called gettheFilling make an array make a  test for each word 
			// when we hit the bread we stop but also check for more bread.
			// check for the letter r and if bread in present we then return whats in the middle.
	public static String[] Getthefilling (String filling) {
		String middle = filling;
		if (filling.indexOf("bread")!= 0) {
			int outside1 = filling.indexOf("bread");
			int outside2 = filling.lastIndexOf("bread");
			middle = filling.substring(outside1 + 5, (outside2));
		}
		String[] finish = middle.split("bread");
		
		return finish;
		
	
	
		
		
		
	}
}
