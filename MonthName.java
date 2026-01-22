    // import java.util.Scanner;

    // public class calculator {
    //     public static void main(String[] args) {

    //         Scanner sc = new Scanner(System.in);

    //         // Taking inputs
    //         System.out.print("Enter first number (a): ");
    //         double a = sc.nextDouble();

    //         System.out.print("Enter second number (b): ");
    //         double b = sc.nextDouble();

    //         System.out.println("Choose operation:");
    //         System.out.println("1 : Addition (+)");
    //         System.out.println("2 : Subtraction (-)");
    //         System.out.println("3 : Multiplication (*)");
    //         System.out.println("4 : Division (/)");
    //         System.out.println("5 : Modulo (%)");

    //         System.out.print("Enter operation number: ");
    //         int op = sc.nextInt();

    //         double result;

    //         switch (op) {
    //             case 1:
    //                 result = a + b;
    //                 System.out.println("Result = " + result);
    //                 break;

    //             case 2:
    //                 result = a - b;
    //                 System.out.println("Result = " + result);
    //                 break;

    //             case 3:
    //                 result = a * b;
    //                 System.out.println("Result = " + result);
    //                 break;

    //             case 4:
    //                 if (b != 0) {
    //                     result = a / b;
    //                     System.out.println("Result = " + result);
    //                 } else {
    //                     System.out.println("Error: Cannot divide by zero!");
    //                 }
    //                 break;

    //             case 5:
    //                 if (b != 0) {
    //                     result = a % b;
    //                     System.out.println("Result = " + result);
    //                 } else {
    //                     System.out.println("Error: Cannot modulo by zero!");
    //                 }
    //                 break;

    //             default:
    //                 System.out.println("Invalid operation!");
    //         }

    //         sc.close();
    //     }
    // }

    
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number!");
        }

        sc.close();
    }
}
