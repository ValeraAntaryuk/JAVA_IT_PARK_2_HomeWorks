import java.util.Scanner;
class Program{
	public static void maim (String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter the number of elements in the array");
		n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++){
			System.out.println("Enter " + i + "number :");
			a[i] = scanner.nextInt();
		}
		int min = 0;
		 
	}
}