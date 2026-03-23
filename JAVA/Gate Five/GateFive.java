
import java.util.Random;
import java.util.Scanner;

public class GateSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            char[] ops = {'+', '-', '*', '/'};
            char op = ops[random.nextInt(4)];

            System.out.print(num1 + "   " + op + "   " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            int correctAnswer;
            switch (op) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '/':
                    correctAnswer = num2 == 0 ? 0 : num1 / num2;
                    break;
                default:
                    correctAnswer = 0;
            }

            if (userAnswer == correctAnswer) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("failed Try again?");
                userAnswer = scanner.nextInt();
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct ");
                    score++;
                } else {
		     System.out.println("Put more effort on next Trial ");
                }
            }
        }
		 System.out.println("Score: " + score + "/10");
		System.out.println("THANKS VERY MUCH FOR YOUR TIME ");


    }
}

