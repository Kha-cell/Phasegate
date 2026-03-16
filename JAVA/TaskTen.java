import java.util.Scanner;
public class TaskTen{
public static void main(String[]  args){
 Scanner input = new Scanner (System.in);
	System.out.print("enter first number :");
	int num1 = input.nextInt();
	System.out.println("enter Second number :");
	int num2 = input.nextInt();
	System.out.print("enter third number :");
	int num3 = input.nextInt();
	int average1 = num1 / 2;
	int average2 = num2 / 2;
	int average3 = num3 / 2;
	System.out.println("average for first number  "   +  average1);
	System.out.println("average for Second number  "   +  average2);
	System.out.println("average for first number  "   +  average3);
}
}