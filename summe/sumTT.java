
import java.util.Scanner;

class sumTT{

        public static void main(String[] args){

                Scanner scan = new Scanner(System.in);
                System.out.println("Geben Sie bitte eine natuerliche Zahl n ein: ");
                Integer zahl = scan.nextInt();
		
		System.out.println("" + calculate(zahl));
		
        }

	public static int calculate(int zahl){

		if(zahl > 0){
			return calculate(zahl-1) + zahl;
		}
		
		return 0;
	}
}






