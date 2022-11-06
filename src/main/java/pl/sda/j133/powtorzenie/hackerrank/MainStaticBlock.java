package pl.sda.j133.powtorzenie.hackerrank;

import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project j133_wiedza
 * @created 05.11.2022
 */
public class MainStaticBlock {
    private static boolean flag;
    private static int B, H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if(B < 0 || H < 0){
//            throw new Exception("Breadth and height must be positive");
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
