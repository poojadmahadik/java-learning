// import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         if (age > 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Not Adult");
//         }
//     }
// }





// import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if ( x % 2 == 0 ) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }



import java.util.*;

public class Conditions {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a == b ) {
        System.out.println("Both are equal");
    } else  {
        if ( a > b ) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }

    }
}

