import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrizUno = 3;
        int matrizDos = 3;

        int[] valoresCajaUno = new int[matrizUno];
        int[] valoresCajaDos = new int[matrizDos];

        for (int i = 0; i < valoresCajaUno.length; i++){
            valoresCajaUno[i] = in.nextInt();
        }
        for (int i = 0; i < valoresCajaDos.length; i++){
            valoresCajaDos[i] = in.nextInt();
        }

        Arrays.sort(valoresCajaUno);
        Arrays.sort(valoresCajaDos);

        if (valoresCajaUno[0] == valoresCajaDos[0] && valoresCajaUno [1] == valoresCajaDos [1] && valoresCajaUno [2] == valoresCajaDos [2]) {
            System.out.println("Box 1 = Box 2");
        } else if (valoresCajaUno [0] >= valoresCajaDos [0] && valoresCajaUno [1] >= valoresCajaDos [1] && valoresCajaUno [2] >= valoresCajaDos [2]) {
            System.out.println("Box 1 > Box 2");
        } else if (valoresCajaUno [0] <= valoresCajaDos [0] && valoresCajaUno [1] <= valoresCajaDos [1] && valoresCajaUno [2] <= valoresCajaDos [2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }

    }
}