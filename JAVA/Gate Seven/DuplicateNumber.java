public class DuplicateNumber {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 2, 4};

        for (int i = 0; i < input.length; i++) {
            int count = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(input[i] + " ");
            }
        }
    }
}