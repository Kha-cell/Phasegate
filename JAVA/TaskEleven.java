import java.util.Scanner;
public class TaskEleven {
public static void main(String[]  args)  {
Scanner scan = new Scanner (System.in);
System.out.println("enter an integer:");
int num = scan.nextInt();
if(num % 2 == 0) {
System.out.println(num +"is even");
}else{
System.out.println(num +"is odd");
 }



   }
}