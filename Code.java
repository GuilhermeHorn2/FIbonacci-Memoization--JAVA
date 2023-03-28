package misc;


public class main_misc {
	private static long[] fib_cache = new long[999];//

	public static void main(String[] args) {
		//

	System.out.println(fib(50));
		
	}	
	private static long fib(int n) {
		if(n <= 2) {
			return 1;
		}
		if(fib_cache[n] != 0) {
			return fib_cache[n];
		}
		long k = fib(n-1) + fib(n-2);
		fib_cache[n] = k;
		return k;
	}
	

	
	
}
