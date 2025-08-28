
public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Example: 10th Fibonacci number
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);
    }

}
