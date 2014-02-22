import java.util.Scanner;
import java.util.LinkedList;

class Teilmenge{

	static String[] str = {"A","B","C","D"};
	LinkedList<String[]> ganzeListe = new LinkedList<String[]>();

	static int zahl = 1;

        public static void main(String[] args){
			calculate();
        }

	public static int calculate(){
		if(zahl <= str.length){


			double s = Math.pow(2, zahl - 1);
			int start = (int) s;
			start = start + 1;
			if(start == 2){start = 1;}
			
			double e = Math.pow(2, zahl);
			int ende  = (int) e;


			System.out.println("--------------------");
			System.out.println(start + " " + ende);

			for(int i=start; i <= ende; i++){
				System.out.println(Integer.toBinaryString(i-1));
//				String.format("%05d", yournumber);
			}
			zahl = zahl + 1;
			calculate();
		}
		return 0;
	}
}


