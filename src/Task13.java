import java.util.Scanner;

public class Task13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a three-digit number: ");
    int inputNumber = scanner.nextInt();
    task13(inputNumber);
    scanner.close();
  }

  private static void task13(int inputNumber) {
    int lastDigit = inputNumber % 10;
    int remainingNumber = inputNumber / 10;
    int newNumber = lastDigit * 100 + remainingNumber;
    double squareRoot = Math.sqrt(newNumber);
    System.out.println("New number: " + newNumber);
    System.out.println("Square root of the new number: " + squareRoot);
  }
}
