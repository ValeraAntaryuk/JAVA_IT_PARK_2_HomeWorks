class Program{
	public static void main (String args []){
		int sum = 0;
		int a[] = {6,2,8,10,8,6};
		int n = a.length - 1;
		for (int i = 0; i <= n; i++){
			sum += a[i];
		}
		System.out.println ("The sum of array elements is " + sum);
    }
}
 