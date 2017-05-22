class Program {
	public static void main (String args[]){
		int a[] = {6,2,8,10,8,6};
		int n = a.length - 1;
		for (int i = 0; i < n;i++){
			for (int j = i + 1; j <= n; j++){
				if (a[i] == a[j]){
					a[j] = 0;	
				}
					
			}
		}
		for (int i = 0;i <= n; i++){
			System.out.print(" " + a[i]);
		}
	}
}