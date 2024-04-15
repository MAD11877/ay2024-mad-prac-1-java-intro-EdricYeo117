import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println();
    for (int i = in.nextInt(); i > 0; i--) {
      System.out.println();
      int integer = in.nextInt();
      numbers.add(integer);
    }

    int mode = numbers.get(0);
    int maxFrequency = 1;
    int currentFrequency = 1;

    // Find the mode using one loop
    for (int i = 1; i < numbers.size(); i++) {
      if (numbers.get(i).equals(numbers.get(i - 1))) {
        currentFrequency++;
      } else {
        currentFrequency = 1;
      }

      if (currentFrequency > maxFrequency) {
        maxFrequency = currentFrequency;
        mode = numbers.get(i);
      }
    }
    System.out.println(mode);
  }
}
