import java.util.Scanner;

class NumberData {
    int number;

    NumberData(int number) {
        this.number = number;
    }
}

class Factorial {

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static void calculateFactorial(NumberData obj) {
        long result = factorial(obj.number);

        System.out.println(
            "Factorial of " + obj.number + " is " + result
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        NumberData data = new NumberData(n);

        calculateFactorial(data);

        sc.close();
    }
}
