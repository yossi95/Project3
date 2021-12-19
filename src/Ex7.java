import java.util.Scanner;
public class Ex7 {
    public static void main(String args[]) {
        double secondRoot = 0, firstRoot = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a ::");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b ::");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c ::");
        int c = scanner.nextInt();

        int determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are  " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Root is  " + (-b + sqrt) / (2 * a));
        }
    }
}



