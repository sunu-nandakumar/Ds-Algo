package ds_algo;

public class PrimeNumbers {
	
	public void primeNumbers() {
		int startingPoint = 0;
		int endingPoint = 1000;
		int count;
		for (int i = startingPoint; i <= endingPoint; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2) {
				int prime = i;
				System.out.println(prime);
				palindrome(prime);
			
			}
				
		}
		
		
		
	}

	public void palindrome(int i) {
		int sum =0 , r ,temp;
		temp = i;
		while ( i > 0) {
			r=i % 10;
			sum=(sum*10)+r;
			i=i/10;
		}
		if (temp==sum)
			System.out.println(sum+ " is palindrome");
		
	}
	public static void main(String[] args) {
		PrimeNumbers primeRange = new PrimeNumbers();
		primeRange.primeNumbers();

	}

}
