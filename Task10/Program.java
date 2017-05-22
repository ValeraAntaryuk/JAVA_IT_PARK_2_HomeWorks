import java.util.Scanner;
class Program {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please,enter your number: ");
		int n = scanner.nextInt();
		int max = -2147483648;
		int a;
		int i = 1;
		while (i<=n){
			System.out.println("Enter number:");
			a = scanner.nextInt();
			if (a>max){
				max = a;
			}
			i = i + 1;
		}
		System.out.println("Maximum number: " + max);
	}
}