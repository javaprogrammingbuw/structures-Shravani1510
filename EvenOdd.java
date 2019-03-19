import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
//		int [] k = new int[10];  
//		int [] s = {1,2,3,4,5,6,7};
		System.out.println("odd numbers till " + k);
		for(int i =0; i<k; i++) {
		if(i%2==1) {
			
//			System.out.println("odd" + i);
			System.out.print( i+ " ");
		}
//		else {
//			System.out.println(" even " +i);
//	  }
	}
  }
	
}
