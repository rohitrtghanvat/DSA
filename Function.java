//ex 1 :-Make a function to add 2 numbers and return the sum

// import java.util.Scanner;

// public class Funcetion {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two number :-");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b);
//         System.out.print("Sum of two number is :- " + sum);
//     }
// }

// ---------------------------------------------------------------------------------------------

// Make a function to multiply 2 numbers and return the product.

// import java.util.Scanner;

// public class Function {
//     public static int calculateProduct(int a, int b) {
//         return a * b;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two number :- ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.print("Product of two numbers :-" + calculateProduct(a, b));
//     }
// }

// ---------------------------------------------------------------------------------------------

// 3. Find the Factorial of number
import java.util.Scanner;

public class Function {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1; // start from 1 is necessary . If start with zero ans will be zero.

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.print(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :-");
        int n = sc.nextInt();

        printFactorial(n);
    }
}