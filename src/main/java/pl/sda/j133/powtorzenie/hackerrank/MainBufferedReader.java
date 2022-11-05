package pl.sda.j133.powtorzenie.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class MainBufferedReader {
    public static void main(String[] argh) {
        Scanner wejscieProgramu = new Scanner(System.in);
        // - wczytaj int    - lub błąd (InputMissmatchException)
        // - wczytaj double -
        // - wczytaj byte   -
        // - wczytaj string -

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 8\n
        // 10\n
        // hello world\n
        //
        // nextInt()    // 8
        // nextInt()    // 10
        // nextLine()   // \n
        // nextLine()   // hello world\n
        try {
            String liniaTekstu;
            do {
                liniaTekstu = reader.readLine();
                String[] słowa = liniaTekstu.split(" ");

                if (liniaTekstu.equals("bubu")){
                    throw new IOException("To błąd dla przykładu");
                }

                int liczba = Integer.parseInt(słowa[0]);
                System.out.println(liczba);

            } while (liniaTekstu != null);
        } catch (IOException ioe) {
            System.out.println("bu bu, błąd");
            System.err.println("ERROR !");
        }

    }
}
