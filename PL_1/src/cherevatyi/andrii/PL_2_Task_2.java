package cherevatyi.andrii;

import java.io.InputStream;
import java.util.Scanner;

public class PL_2_Task_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = input.nextInt();
        input.close();
        System.out.print("isNearHundred: " + isNearHundred(n));
    }

    static boolean isNearHundred(int n) {
        if ((n >= 90 & n <= 110) | (n >= 190 & n <= 210)) return true;
        else return false;
    }

}
