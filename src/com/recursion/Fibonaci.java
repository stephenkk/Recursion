package com.recursion;

public class Fibonaci {
	
	int fibo(int x) {
		if (x <= 1)
			return x;
		else return fibo(x -1) + fibo(x-2);
		
	
	}

}
