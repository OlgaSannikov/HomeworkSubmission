import java.util.Scanner;

public class UnitConversion
 {
    public static void main(String[] args)
    {

        converter();

    }

    public static void converter(){
       /* 4. Write a Java program that reads a number in inches, converts it to meters. Note:
        One inch is 0.0254 meter. Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of inches");
        double number1=input.nextDouble();
        System.out.println("You enter "+ number1 +" inch" + " and it is equals to " + (number1 * 0.0254) + " meters");
    }

}

