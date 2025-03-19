import java.util.ArrayList;
import java.util.List;

public class fibonacciSequence {
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciList = new ArrayList<>();
        if (n <= 0) return fibonacciList;
        
        fibonacciList.add(0);
        if (n == 1) return fibonacciList;
        
        fibonacciList.add(1);
        
        for (int i = 2; i < n; i++) {
            fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
        }
        
        return fibonacciList;
    }
    
    public static void main(String[] args) {
        int n = 11;
        System.out.println("First " + n + " Fibonacci numbers: " + generateFibonacci(n));
    }
}
