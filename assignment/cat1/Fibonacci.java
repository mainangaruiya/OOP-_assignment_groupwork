public class Fibonacci {

    public static void main(String[] args) {
        int limit = 4000000;
        int i = 0;
        int fib;

        System.out.print("Fibonacci numbers less than " + limit + ": ");
        while ((fib = fibonacci(i)) < limit) {
            System.out.print(fib + " ");
            i++;
        }
        System.out.println();

        System.out.println("Sum of even-valued Fibonacci terms: " + sumEvenFibonacci(limit));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 1;
        int b = 2;

        while (b <= limit) {
            if (b % 2 == 0) sum += b;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}
