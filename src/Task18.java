import java.util.Scanner;

public class Task18 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter coefficient a: ");
    double a = scanner.nextDouble();
    System.out.print("Enter coefficient b: ");
    double b = scanner.nextDouble();
    System.out.print("Enter coefficient c: ");
    double c = scanner.nextDouble();
    scanner.close();
    task18(a, b, c);
  }

  private static void task18(double a, double b, double c) {
    double discriminant = b * b - 4 * a * c;
    if (discriminant < 0) {
      System.out.println("No real roots.");
    } else {
      double sqrtDiscriminant = Math.sqrt(discriminant);
      if (sqrtDiscriminant == Math.floor(sqrtDiscriminant)) {
        double x1 = (-b + sqrtDiscriminant) / (2 * a);
        double x2 = (-b - sqrtDiscriminant) / (2 * a);
        if (x1 == Math.floor(x1) && x2 == Math.floor(x2)) {
          System.out.printf("The equation has integer roots: %.0f and %.0f%n", x1, x2);
        } else {
          System.out.println("The equation does not have integer roots.");
        }
      } else {
        System.out.println("The equation does not have integer roots.");
      }
    }
  }
}
