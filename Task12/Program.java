import java.util.Scanner;
class Program{
	public static void main (String args[]){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter,your number:");
		int n = scanner.nextInt();
		int locmax = 0;
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		while (i < n){
			System.out.println("Enter,your " + (i + 1) + " number:");
			c = scanner.nextInt();
			if (i > 1 && a < b && b > c){
				locmax++;
			}
			a = b;
			b = c;
			i++;
		}
		System.out.println("Local maximum: " + locmax);
	}
}
