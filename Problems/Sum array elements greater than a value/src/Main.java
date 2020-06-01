import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // read array size
        int size = in.nextInt();
        int[] array = new int[size];
        int sum = 0;

        // read elements of array
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        // and only now read the number n
        int n = in.nextInt();

        // now that we have all data, we can calculate the sum
        for (int value : array) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}