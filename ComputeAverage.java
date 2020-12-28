/* Peter Abdulmasih
* 
* Programming Essentials
*
* October 11, 2018
* 
* The purpose of this program is to accept 3 numbers from the user and then output the average of those three numbers.
*
* Original Version: 10/2/2018
*/

import java.util.Scanner;
   public class ComputeAverage{                                
      public static void main (String[] args){                      
         Scanner input = new Scanner (System.in);
         System.out.println ("Please Enter 3 Numbers");                     // The system will prompt the user to enter 3 numbers in the console.
         double number1 = input.nextDouble();                               // The variable is initialized to the first number, which is the first user input.
         double number2 = input.nextDouble();                               // The variable is initialized to the second number, which is the second user input.
         double number3 = input.nextDouble();                               // The variable is initialized to the third number, which is the third user input.
         double Average = ((number1 + number2 + number3) / 3);              // The variable, 'Average', is an equation in which all three numbers are added and divided by three, since there are three numbers.
         System.out.println ("The Average of your number is: " + Average);  // The system outputs the result in the console.
   }
}
