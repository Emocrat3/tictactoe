import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [][] matriz = new String [n][n];
        int a = 0, b = n-1, valor = 1;
        for (int j = 0; j < matriz.length; j++) {
            // Para llenar la fila superior de la matriz
            for (int i = a; i <= b; i++) {
                matriz[a][i] = valor++ + " ";
            }
            // Llenar columna derecha arriba a abajo
            for (int i = a + 1; i <= b; i++) {
                matriz[i][b] = valor++ + " ";
            }
            // Llenar fila inferior de derecha a izquierda
            for (int i = b - 1; i >= a; i--) {
                matriz[b][i] = valor++ + " ";
            }
            // Llenar columna izquierda de abajo a arriba
            for (int i = b - 1; i >= a + 1; i--) {
                matriz[i][a] = valor++ + " ";
            }
            a++; b--;
        }
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }
    }
}