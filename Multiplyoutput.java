import java.util.Scanner;

public class Multiplyoutput {

    public static void main(String[] args){

        twoNumbers();

    }
    public static void twoNumbers (){
        /* 3. Write a Java program that takes two numbers as input and display the product of two numbers. https://data-flair.training/blogs/read-java-console-input/ (Links to an external site.)
        Angel prefers to use the scanner class in Java.
        Example:
        Input first number: 25
        Input second number: 5
        Expected Output: 25 x 5 = 125 */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int number1=input.nextInt();
        System.out.println("Please enter second number");
        int number2=input.nextInt();
        System.out.println("The product of two numbers is: "+(number1*number2));
    }

}
