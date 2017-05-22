import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, your number");
		int a = scanner.nextInt(); 
		int y,x1,x2,x3,x4,x5,x6,x7,x8,itog;
		y = a / 2; 
		System.out.println("y8 = " + y);
			x8 = a % 2; 
			a = y;
			//System.out.println("x8 = " + x8);
		y = a / 2; 
		    System.out.println("y7 = " + y);
			x7 = a % 2; 
			a = y;
			//System.out.println("x7 = " + x7);
		y = a / 2; 
		    System.out.println("y6 = " + y);
			x6 = a % 2;
            a = y;		
			//System.out.println("x6 = " + x6);
		y = a / 2; 
		    System.out.println("y5 = " + y);
			x5 = a % 2;
			a = y;
			//System.out.println("x5 = " + x5);
		y = a / 2; 
		System.out.println("y4 = " + y);
			x4 = a % 2; 
			//System.out.println("x4 = " + x4);
			a = y;
		y = a / 2; 
		System.out.println("y3 = " + y);
			x3 = a % 2; 
			//System.out.println("x3 = " + x3);
			a = y;
			//System.out.println("a3 = " + a);
		y = a / 2; 
		System.out.println("y2 = " + y);
			x2 = a % 2;
			a = y;	
			y = a / 2;
			System.out.println("y1 = " + y);
			x1 = a % 2;
			//System.out.println("x1 = " + x1);
				System.out.println("itog = " + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8);
		/*System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
	    System.out.println("x4 = " + x4);
		System.out.println("x5 = " + x5);
		System.out.println("x6 = " + x6);
		System.out.println("x7 = " + x7);
		System.out.println("x8 = " + x8);
		*/
	}
}