import java.util.Scanner;

public class Task14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first leg: ");
    double firstLeg = scanner.nextDouble();
    System.out.print("Enter the second leg: ");
    double secondLeg = scanner.nextDouble();
    task14(firstLeg, secondLeg);
    scanner.close();
  }

  private static void task14(double firstLeg, double secondLeg) {
    double hypotenuse = Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    System.out.println("Hypotenuse: " + hypotenuse);
    double height = (firstLeg * secondLeg) / hypotenuse;
    System.out.println("Height: " + height);
  }
}
