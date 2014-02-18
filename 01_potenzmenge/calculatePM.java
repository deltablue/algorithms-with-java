import java.util.Scanner;

class CalculatePM{

	public static void main(String[] args){
	
                Scanner scan = new Scanner(System.in);
                System.out.println("Geben Sie bitte eine Menge ein, in der Form: xxx;xxxx;xxxxx;");
                String str = scan.next();
               // System.out.println(str);
                String[] arr = str.split(";");
                for (int i = 0; i < arr.length; i++){
                	System.out.println(arr[i]);
		}

		rekursiv(4){
		}
	}

	public void rekursiv(int i){
		System.out.println();
	}

}
