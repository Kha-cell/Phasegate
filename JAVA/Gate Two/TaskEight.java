
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println("You entered: " + num);
        }
          }
}