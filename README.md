# Java-for-Android-Developers
Java for Android Developers (10h)
 
## Fundamentos del lenguaje (2h)
 
 1. Comments
 
 ```
  a. /** Comment **/
  b. /* Comment */
  c. // Comment
 ```
 
 2. Hello World Example
 
 ```
 /** 
  * The HelloWorldApp class implements an application that
  * simply prints "Hello World!" to standard output.
  */
 class HelloWorldApp {
     public static void main(String[] args) {
         System.out.println("Hello World!"); // Display the string.
     }
 }
 ```
 
 3. Variables
 
 ```
 int age = 21;
 float speed = 45.5f;
 double temperature = 23.5;
 boolean running = true;
 long milliseconds = 10929239101023L;
 char letter = 'C';
 String word = "This is a word example in Java";
 ```
 
 4. Primitives
 
  * byte (0)
  * short (0)
  * int (0)
  * long (0)
  * float (0.0f)
  * double (0.0)
  * boolean (false)
  * char ('\u0000')
  * String (null)
  
 5. Samples

  ```
  boolean result = true;
  char capitalC = 'C';
  byte b = 100;
  short s = 10000;
  int i = 100000;

  // The number 26, in decimal
  int decVal = 26;
  //  The number 26, in hexadecimal
  int hexVal = 0x1a;
  // The number 26, in binary
  int binVal = 0b11010;

  double d1 = 123.4;
  // same value as d1, but in scientific notation
  double d2 = 1.234e2;
  float f1  = 123.4f;
  ```
  
 6. Operators
 
 <img src = "https://github.com/BelatrixTraining/Java-for-Android-Developers/blob/Lesson1/images/java-operators.png" />
  
 7. Arrays

  ```
     // declares an array of integers
    int[] anArray;
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;
  ```

  ```
    // create an array of integers
    anArray = new int[10];
    anArray[0] = 100; // initialize first element
    anArray[1] = 200; // initialize second element
    anArray[2] = 300; // and so forth
  ```

  ```
    int[] anArray = { 
        100, 200, 300,
        400, 500, 600, 
        700, 800, 900, 1000
    };
  ```
  
 8. Control flow statements

 ```
  class IfElseDemo {
      public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
      }
  }
  
 ```

 ```
  public class SwitchDemo {
    public static void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}
 ```

 ```
  class DoWhileDemo {
      public static void main(String[] args){
          int count = 1;
          do {
              System.out.println("Count is: " + count);
              count++;
          } while (count < 11);
      }
  }
 ```

 ```
  class ForDemo {
      public static void main(String[] args){
           for(int i=1; i<11; i++){
                System.out.println("Count is: " + i);
           }
      }
  }
 ```
  
 9. Exercises

 - https://leetcode.com/problems/reverse-string
 - https://leetcode.com/problems/maximum-depth-of-binary-tree
 - https://leetcode.com/problems/sum-of-two-integers
 - https://leetcode.com/problems/invert-binary-tree
 - https://leetcode.com/problems/sum-of-left-leaves

 
## Referencias 

 - http://docs.oracle.com/javase/tutorial/index.html
 - https://google.github.io/styleguide/javaguide.html
 - https://www.compilejava.net/
 - https://www.edx.org/course/java-fundamentals-android-development-galileox-caad001x
 - https://leetcode.com/
