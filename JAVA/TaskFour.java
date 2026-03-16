import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number? ");
	int num1 = scanner.nextInt();
	 System.out.print("enter another number? ");
	int num2 = scanner.nextInt();
	int product1 = num1 * 2;
	int  product2 = num2 * 2;
	System.out.println("First number product      " + product1);
	System.out.println("Second number Product   " + product2);
}
}