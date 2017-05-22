class Program{
	public static void main(String args []){
		double average = 0.0;
		int sum = 0;
		int a[] = {6,2,8,10,8,6};
		int n = a.length - 1;
		for (int i = 0; i <= n; i++){
			sum += a[i];
		}
		average = (sum * 1.0) / (n + 1);
		System.out.println("The arithmetic mean of the numbers in the array is " + average);
	}
}