public class FibonacciNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Please provide exactly one integer argument.");
            System.exit(1);
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer.");
            System.exit(1);
            return; // To satisfy compiler about initialization
        }

        if (n < 0) {
            System.err.println("Please provide a non-negative integer.");
            System.exit(1);
        }

        System.out.println(fibonacci(n));
    }

    // Method to compute nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}

