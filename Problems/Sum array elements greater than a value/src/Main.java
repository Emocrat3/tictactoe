import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Lee el largo del array
        int size = in.nextInt();
        int[] array = new int[size];
        int sum = 0;

        // Lee elementos del array
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        // Lee la condicion para la suma
        int n = in.nextInt();

        // for each y calculamos la suma
        for (int value : array) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}