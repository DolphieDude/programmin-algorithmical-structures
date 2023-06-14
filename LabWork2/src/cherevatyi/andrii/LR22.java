package cherevatyi.andrii;

import java.util.Scanner;

public class LR22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        double x = input.nextDouble();
        System.out.print("y = ");
        double y = input.nextDouble();
        System.out.println("A(" + x + "," + y + ") -- " + task3(x, y));
        System.out.print("x = ");
        x = input.nextDouble();
        System.out.print("y = ");
        y = input.nextDouble();
        System.out.println("A(" + x + "," + y + ") -- " + task3(x, y));
        System.out.print("x = ");
        x = input.nextDouble();
        System.out.print("y = ");
        y = input.nextDouble();
        System.out.println("A(" + x + "," + y + ") -- " + task3(x, y));
        System.out.println("***********************");
        double xTask4 = -2.;
        double yTask4 = 1.2;
        double zTask4 = 9.5;
        System.out.println(task4(xTask4, yTask4, zTask4) + " < (x1 + y1 + z1) / 2");
        xTask4 = 0.5;
        yTask4 = 2;
        zTask4 = -0.15;
        System.out.println(task4(xTask4, yTask4, zTask4) + " < (x2 + y2 + z2) / 2");
        xTask4 = 0.4;
        yTask4 = 2.2;
        zTask4 = 9.5;
        System.out.println(task4(xTask4, yTask4, zTask4) + " < (x2 + y2 + z2) / 2");
    }
    static String task3(double x, double y) {
        if (x > 0 && y > 0) return "Точка знаходиться у першої чверті";
        else return "Точка НЕ знаходиться у першої чверті";
    }
    static double task4(double x, double y, double z) {
        double average = (x + y + z) / 2;
        if (x < average) return x;
        if (y < average) return y;
        if (z < average) return z;
        return 0;
    }
}
