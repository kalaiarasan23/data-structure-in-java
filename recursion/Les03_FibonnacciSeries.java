package recursion;

public class Les03_FibonnacciSeries {
	public static void main(String[] args) {
		System.out.println(fib(7));    // 1 1 2 3 5 8
		System.out.println(fibs(5));   // 1 2 3 5 8  
		
	}

	private static int fibs(int i) {
		// TODO Auto-generated method stub
		if(i==1)
			return 1;
		if(i==2)
			return 2;
		return fibs(i-1)+fibs(i-2);
	}

	private static int fib(int i) {
		if(i == 1 || i==2) 
			return 1;
		return fib(i-1)+fib(i-2);
	}
/*	fib(7) calls:

fib(6) + fib(5)
fib(6) calls:

fib(5) + fib(4)
fib(5) calls:

fib(4) + fib(3)
fib(4) calls:

fib(3) + fib(2)
fib(3) calls:

fib(2) + fib(1)
fib(2) returns 1 (base case)

fib(1) returns 1 (base case)

fib(3) evaluates to fib(2) + fib(1) = 1 + 1 = 2

fib(2) returns 1 (base case)

fib(4) evaluates to fib(3) + fib(2) = 2 + 1 = 3

fib(3) calls:

fib(2) + fib(1)
fib(2) returns 1 (base case)

fib(1) returns 1 (base case)

fib(3) evaluates to fib(2) + fib(1) = 1 + 1 = 2

fib(5) evaluates to fib(4) + fib(3) = 3 + 2 = 5

fib(4) calls:

fib(3) + fib(2)
fib(3) calls:

fib(2) + fib(1)
fib(2) returns 1 (base case)

fib(1) returns 1 (base case)

fib(3) evaluates to fib(2) + fib(1) = 1 + 1 = 2

fib(2) returns 1 (base case)

fib(4) evaluates to fib(3) + fib(2) = 2 + 1 = 3

fib(6) evaluates to fib(5) + fib(4) = 5 + 3 = 8

fib(5) calls:

fib(4) + fib(3)
fib(4) calls:

fib(3) + fib(2)
fib(3) calls:

fib(2) + fib(1)
fib(2) returns 1 (base case)

fib(1) returns 1 (base case)

fib(3) evaluates to fib(2) + fib(1) = 1 + 1 = 2

fib(2) returns 1 (base case)

fib(4) evaluates to fib(3) + fib(2) = 2 + 1 = 3

fib(3) calls:

fib(2) + fib(1)
fib(2) returns 1 (base case)

fib(1) returns 1 (base case)

fib(3) evaluates to fib(2) + fib(1) = 1 + 1 = 2

fib(5) evaluates to fib(4) + fib(3) = 3 + 2 = 5

fib(7) evaluates to fib(6) + fib(5) = 8 + 5 = 13

So, fib(7) returns 13,
 * */
}
