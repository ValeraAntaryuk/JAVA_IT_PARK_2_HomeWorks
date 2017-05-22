import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please,enter your number:");
		int n = scanner.nextInt(); 
		int min = 2147483647;
		int a;
		int i = 1;
		while (i<=n) {
			System.out.println("Enter, number");
			a = scanner.nextInt(); 
			if (a < min) {
					min = a;
			}
			i = i + 1;
		}
		System.out.println("Minimum number: " + min);
    }	
}
