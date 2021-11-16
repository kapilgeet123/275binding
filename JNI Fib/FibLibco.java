//package com.intel.fibonacci;

public class FibLibco {
	/** Fibonacci Native - Recursive */
	//public static native long fibJ(long n);

	/** Fibonacci Native - Iterative */
	//public static native long fibNI(long n);

	/** Fibonacci in Java - Recursive */

	public static long fibT(long n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibT(n-1)+fibT(n-2);
	}


	public static void main (String args[]) {
    long n = 50;
    long resultJ = 0;
		System.out.println("Hi");
		long startT = System.nanoTime();

		 //for (int i = 0; i < 10; i++) {
			resultJ = (new FibLibco()).fibT(n);
		//}

		long timeT = System.nanoTime() - startT;
		System.out.println("Total execution time in java "
						+ timeT/10);
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
// static {
// 	System.loadLibrary("Fibonacci");
// }
}
