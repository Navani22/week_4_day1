
//Question 4 & 5 are in same question question 4


import java.util.Scanner;

class MaxRetriesException extends Exception {
  @Override
  public String toString() {
    return " Max Retries reached!";
  }

  @Override
  public String getMessage() {
    return " Max Retries reached!";
  }
}

public class Practice1_4 {
  public static void main(String[] args) throws MaxRetriesException {

    boolean flag = true;
    int[] marks = { 7, 56, 6, 9, 11, 70 };
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int j = 5;
    while (flag && i < 5) {
      if (j <= 5 && j > 1) {
        System.out.println("You have total of " + j + " tries remaining");
      } else if (j == 1) {
        System.out.println("You have only 1 try remaining");
      }

      try {
        System.out.println("Enter the value of index: ");
        int index = sc.nextInt();
        System.out.println("The value of marks at index " + index + " is: " + marks[index]);
        break;
      } catch (Exception e) {
        System.out.println("Invalid Index");
        j--;
        i++;

      }
      if (j <= 0) {
        try {
          throw new MaxRetriesException();
        } catch (MaxRetriesException e) {
          System.out.println("Error: " + e);
        }
      }
    }

  }
}