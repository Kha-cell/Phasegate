import java.util.Scanner;
public class TaskFive{
public static void main(String[]  args){
 Scanner input = new Scanner (System.in);
System.out.print("enter your temperature:");
double num1= input.nextDouble();
double num2= 0.305;
double sum= num1 * num2;
System.out.printf("%f", sum);

  }
}