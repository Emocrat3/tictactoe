package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String charac = in.next();
        System.out.println("---------");
        System.out.println ("| " + charac.charAt (0) + " " + charac.charAt (1) + " " + charac.charAt (2) + " |");
        System.out.println ("| " + charac.charAt (3) + " " + charac.charAt (4) + " " + charac.charAt (5) + " |");
        System.out.println ("| " + charac.charAt (6) + " " + charac.charAt (7) + " " + charac.charAt (8) + " |");
        System.out.println("---------");
    }
}
