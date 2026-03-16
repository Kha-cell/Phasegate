import java.util.Scanner;
   public class TaskTwelve {
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      System.out.println("Enter first integer");
      int number1 = input.nextInt();
    
      int counter = 0;
      
      
      if (number1 < 0) {
     System.out.println("negative");
}
      
   else  (number1 > 0) {
      System.out.println("positive");
 }

  else  (number1 == 0) {
  System.out.println("zero");
}
  
     }
