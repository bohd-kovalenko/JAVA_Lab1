import java.util.Scanner;

public class Task8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer number: ");
    int input = scanner.nextInt();
    task8(input);
    scanner.close();
  }

  private static void task8(int a) {
    long secondVar = (long) a * a;
    System.out.printf("A in second power: %d%n", secondVar);
    secondVar = secondVar * secondVar;
    System.out.printf("A in fourth power: %d%n", secondVar);
    secondVar = secondVar * secondVar;
    System.out.printf("A in eighth power: %d%n", secondVar);
  }
}
