import java.util.Scanner;

public class Ex11 {

	/// Q1
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 16347589 ;
		boolean value = alternate(number);
		System.out.println(value);
		
		int[] array = {16347589, 11, 1233, 41, 309, 15};
		int i = sumOfDigits(array);
		System.out.println(i);
	}

	
	public static boolean alternate(int num) {
		boolean even= (num%10)%2 == 0;
		while (num!=0){
			if (even == true && (num%10)%2 != 0)
				return false;
			else if (even == false && (num%10)%2 == 0)
				return false;
			num = num / 10;
			even = !even;
		}
		return true;
	}

	
	//// Q1
	public static int sumOfDigits(int[] arr) {
		int sum=0, minSum=1000000, minIndex=-1;
		for (int i = 0; i < arr.length; i++) {
			if (alternate(arr[i])){
				sum= sumNum(arr[i]);
				if (sum < minSum){
					minSum = sum;
					minIndex = i;
				}
			}	
		}
		return minIndex;
	}
	
	
	public static int sumNum (int num){
		int sum=0;
		while (num!=0){
			sum = sum + (num%10);
			num= num/10;
		}
		return sum;
	}
	
}





