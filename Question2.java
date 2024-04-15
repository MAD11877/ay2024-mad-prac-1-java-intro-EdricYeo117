import java.util.Scanner;
import java.util.Scanner;
public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
             Scanner in = new Scanner(System.in);
     
             System.out.print("Enter a height (in meters): ");
             double height = in.nextDouble();
     
             System.out.print("Enter a weight (in kilograms): ");
             double weight = in.nextDouble();
     
             double bmi = weight / (height * height);
             double finalbmi = Math.round(bmi*100)/100;
             System.out.println("BMI: " + finalbmi);    
  }
}
