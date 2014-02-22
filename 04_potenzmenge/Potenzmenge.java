import java.util.Scanner;
import java.util.Arrays;

class Potenzmenge{


        public static void main(String[] args){
		String[] str = {"A","B","C","D"};
		calculate(str, str.length-1);

        }

	public static void calculate(String[] arr, int n){
		System.out.println("n:" + n);
		if(n == 0){
			System.out.println("");
			return;
		}
		else{
			for(int i = 0; i < (int) Math.pow(2, n); i++){
				if(i < (int) Math.pow(2, n-1)){
					calculate(Arrays.copyOfRange(arr,0,(int)Math.pow(2,n-1)-1),n-1);
					System.out.println("i:" + i);
					System.out.println("n1:" + n);
					return;
				}
				else{
					calculate(Arrays.copyOfRange(arr,(int)Math.pow(2,n-1),(int)Math.pow(2,n)),n-1);
					System.out.print(arr[i]);
					return;
				}
			}
		}
	}
}


