import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your age? ");
	int age = scanner.nextInt();
	int result = age + 5;
	System.out.println("your age in next five years is " + result );
}

}