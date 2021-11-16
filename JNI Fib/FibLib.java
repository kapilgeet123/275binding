//package com.intel.fibonacci;

public class FibLib {
	/** Fibonacci Native - Recursive */
	public static native long fibJ(long n);

	/** Fibonacci Native - Iterative */
	//public static native long fibNI(long n);

	/** Fibonacci in Java - Recursive */

	// public static long fibJ(long n) {
	// 	if(n==0) return 0;
	// 	if(n==1) return 1;
	// 	return fibJ(n-1)+fibJ(n-2);
	// }


	public static void main (String args[]) {
    long n = 50;
    long resultJ = 0;
		long start = System.nanoTime();

		//for (int i = 0; i < 10; i++) {
			resultJ = (new FibLib()).fibJ(n);
		//}

		long timeJ = System.nanoTime() - start;
		System.out.println("Total execution time in java "
						+ timeJ/10);
	/** Fibonacci in Java - Iterative */
	// public static long fibJI(long n) {
  //       long previous = -1;
  //       long result = 1;
  //       for (long i = 0; i <= n; i++) {
  //           long sum = result + previous;
  //           previous = result;
  //           result = sum;
  //       }
  //       return result;
  //   }


}
static {
	System.loadLibrary("Fibonacci");
}
}
