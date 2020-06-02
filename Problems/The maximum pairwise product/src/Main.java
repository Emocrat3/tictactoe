import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int maxProducto = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            int producto = array[i] * array[i + 1];
            if (producto > maxProducto) {
                maxProducto = producto;
            }
        }

        System.out.println(maxProducto);
    }
}