class Program{
	public static void main (String args[]){
		int a[] = {6,2,8,10,8,6};
		int n = a.length - 1;
		int c = 0;
		for (int i = 0;i <= (n / 2); i++){
			c = a[i];
			a[i] = a[n-i];
			a[n-i] = c;
		}
		for (int i = 0;i <= n; i++){
			System.out.print(" " + a[i]);
		}
	}
}