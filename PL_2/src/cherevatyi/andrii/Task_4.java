package cherevatyi.andrii;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();
        input.close();
        System.out.println(isInRange(a, b, c));
    }

    static boolean isInRange(int a, int b, int c) { return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19); }

}
