import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */
			if(0<b && b<10) {
				switch(a%b) {
				case 0:
					System.out.println("ZERO");
				case 1:
					System.out.println("ONE");
					break;
				case 2:
					System.out.println("TWO");
					break;
				case 3:
					System.out.println("THREE");
					break;
				
				case 4:
					System.out.println("FOUR");
					break;
				
				case 5:
					System.out.println("FIVE");
					break;
				
				case 6:
					System.out.println("SIX");
					break;
				
				case 7:
					System.out.println("SEVEN");
					break;
				
				case 8:
					System.out.println("EIGHT");
					break;
				
				case 9:
					System.out.println("NINE");
					break;
				
				case 10:
					System.out.println("TEN");
					break;
				default:
					System.out.println("a%b >10");	
			}
		}else {
			System.out.println("entered num is out of range 0<b<10 and \n Try  within the limits ");
		}
	}
}
