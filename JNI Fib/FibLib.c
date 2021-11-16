#include <stdio.h>
#include <jni.h>
#include <time.h>
#include "FibLib.h"

static jlong fib(jlong n) {
	if(n==0) return 0;
	if(n==1) return 1;
	return fib(n-1)+fib(n-2);
}

JNIEXPORT jlong JNICALL Java_FibLib_fibJ
  (JNIEnv *env, jclass clazz, jlong n) {
  long ans =0;
  clock_t tic = clock();
  ans = fib(40);//hardcoded
   clock_t toc = clock();
  double duration = (double)(toc - tic) / CLOCKS_PER_SEC;
  printf("duration = %f",duration);
  return ans;
}
