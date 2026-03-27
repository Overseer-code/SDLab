
// Java Intro to Variables Example
public class Main {
      public static void main(String[] args) {
          // single-line comment: program starts here
          /*
          Multi-line comment;
          This program defines: - Java Intro - Sysntax - Output - Comments - Variables
          */
         // Declaring variables
         int age = 23;                    // integar variable
         String name = "Hasan";            // string variable
         String ID = "C243034";           // string variable
         double gpa = 3.00;               //double(floating-point number)
         char grade = 'A';                //character variable
         boolean isstudent = true;        //boolean variable

         // printing variables to the terminal
         System.out.println("My name is " + name + ".");
         System.out.println("I am " + age + " years old.");
         System.out.println("My GPA is " + gpa + " and my grade is " + grade + ".");
         System.out.println("Am I a student?" + isstudent);
         System.out.println("ID is " + ID + ".");

         // --- Java Type Casting ---
         int num1 = 30;
         double widened = num1;            // Automatic typecasting (int -> double)
         double num2 = 5.44;
         int narrowed = (int) num2;        // Manual typecasting (double -> int)
         System.out.println("\n--- Type Casting Examples ---");
         System.out.println("Original int: " + num1);
         System.out.println("Widened to double: " + widened);
         System.out.println("Original double: " + num2);
         System.out.println("Narrowed to int: " + narrowed);

      }

}