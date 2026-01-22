public class variable {
    public static void main(String[] args)
    {
        int a = 5;
        
        int b = 10;

        int sum = a + b;
        System.out.println(sum);

        int diff = b - a;
        System.out.println(diff);

    }
}


// Types of Variables in Java

//⭐ 1. Local Variable
// A variable declared inside a method, constructor, or block is called a local variable.


// public class variable {
//     public void show() {
//         int age = 20;  // local variable
//         System.out.println(age);
//     }
// }




//⭐ 2. Instance Variable
// A variable declared inside a class but outside any method, constructor, or block is called an instance variable.

// public class Student {

//     // instance variables
//     String name = "Pooja";
//     int marks = 85;

//     public void display() {
//         System.out.println(name + " scored " + marks);
//     }
// }
  


//⭐ 3. Static Variable
// A variable declared with the static keyword inside a class but outside any method, constructor, or block is called a static variable.


// public class student {
//     // static variable
//     static String schoolName = "ABC High School";

//     public void show() {
//         System.out.println("School Name: " + schoolName);
//     }
// }