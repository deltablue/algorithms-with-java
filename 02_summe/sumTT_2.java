
import java.util.Scanner;

class sumTT_2{

        public static void main(String[] args){

                Scanner scan = new Scanner(System.in);

                System.out.println("Geben Sie bitte eine ganze Zahl n ein: ");
                Integer zahl1 = scan.nextInt();

		System.out.println("Geben Sie bitte eine ganze Zahl k ein mit k =< n:");
		Integer zahl2 = Integer.MAX_VALUE;
		while( zahl1 < zahl2){
			System.out.println("Fehler: k > n Zahl bitte neu eingeben." );
			zahl2 = scan.nextInt();
		}

		System.out.println("" + calculate(zahl1,zahl2));

        }

	public static int calculate(int zahl1, int zahl2){

		if(zahl1 >= zahl2){
			return calculate(zahl1-1, zahl2) + zahl1;
		}
		return 0;
	}
}






