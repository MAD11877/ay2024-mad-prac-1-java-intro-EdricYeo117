import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
    Scanner scanner = new Scanner(System.in);  
    int n = scanner.nextInt();
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int num = scanner.nextInt();
      numbers.add(num);
    }

    int maxCount = 0;
    int mode = 0;
    for (int num : numbers) {
      int count = Collections.frequency(numbers, num);
      if (count > maxCount) {
        maxCount = count;
        mode = num;
      }
    }
    
    System.out.println(mode);
  }
}
