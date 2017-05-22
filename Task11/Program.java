import java.util.Scanner;
class Program {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter, your number:");
		int n = scanner.nextInt();
		int summa = 0;
		int a = 0;
		double sred = 0;
		int i = 1;
		while (i<=n){
			System.out.println("Enter your "+ i +" number:");
			a = scanner.nextInt();
			summa = summa + a;
			i = i + 1;
		}
		sred = (summa*1.0) / n;
		System.out.println("Arithmetic mean:" + sred);
	}
}