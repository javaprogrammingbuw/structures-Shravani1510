import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		int R1 = a+b+c;
		int R2 = R1/3;
		if(a<b && a<c) {
			System.out.println("min Value a  "+ a);
		}else if(b<c && b<a) {
			System.out.println("min Value b "+ b);
		}else {
			System.out.println("min value c " +c);
		}
		if(a>b && a>c) {
			System.out.println("max value a"+a);
		}else if(b>c && b>a) {
			System.out.println(" max value b" + b);
		}else {
			System.out.println("max value c "+ c);
		}
		
	
		System.out.println("Sum"+ " = " +R1);
		System.out.println("mean"+" = " + R2);
		
		

	}

}
