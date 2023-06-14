package cherevatyi.andrii;

import java.util.Scanner;

public class PL_2_Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = input.nextInt();
        input.close();
        System.out.print("diff21: " + diff21(n));
    }

    static int diff21(int n) {
        if (n <= 21) return 21 - n;
        else return (n - 21) * 2;
    }

}
