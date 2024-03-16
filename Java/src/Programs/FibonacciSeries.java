package Programs;

public class FibonacciSeries {
	public int[] generateFibonacciSeries(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Number of terms should be greater than zero");
        
        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
        }
        return fibonacciSeries;
    }
}


