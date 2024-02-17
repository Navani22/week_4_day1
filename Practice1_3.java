import java.util.Scanner;

public class Practice1_3 {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    Scanner scanner = new Scanner(System.in);
    int retries = 0;

    while (retries < 5) {
      System.out.print("Enter index to access the array: ");
      int index = scanner.nextInt();
      try {
        System.out.println("Value at index " + index + ": " + array[index]);
        break; // Exit loop if successful
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Retry!");
        retries++;
      }
    }
    if (retries == 5) {
      System.out.println("Max retries reached. Exiting...");
    }
    scanner.close();
  }


}
