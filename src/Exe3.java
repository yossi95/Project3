public class Exe3 {
	
	public static void main(String[] args) {
		int num = 12600;
		int[] arr= Factorization(num);
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i]+", ");בדיקה
		}
		
		///
	}
	
	
	
	public static int[] Factorization(int num) {
		int[] temp= new int[num];
		int k=0;
		for (int i = 2; i <= num; i++) {
			while (num%i==0){
				num= num/i;
				temp[k] = i;
				k++;
			}
		}
		int[] factors = new int[k];
		for (int i = 0; i < k; i++) {
			factors[i]= temp[i];
		}
		return factors;
	}
}