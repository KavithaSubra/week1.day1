package week1.day1;

public class FibonacciSeries {
public static void main(String[] args) {
	int n=10, firstTerm = 0, secondTerm = 1;
	System.out.println("Print the fibonacci series till " + n +" terms");
	System.out.println(firstTerm);
	System.out.println(secondTerm);
	for(int i=2; i<n; ++i)
	{
		int nextTerm = firstTerm + secondTerm;
		System.out.println(nextTerm); 
	    firstTerm = secondTerm;
	    secondTerm = nextTerm;
	}
}
}
