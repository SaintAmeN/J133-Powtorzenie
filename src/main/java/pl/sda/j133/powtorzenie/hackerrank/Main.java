package pl.sda.j133.powtorzenie.hackerrank;

import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class Main {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int wynik = a;
            for (int j = 0; j < n; j++) {
                wynik = wynik + (int) ((Math.pow(2, j) * b));
                System.out.print(wynik + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
