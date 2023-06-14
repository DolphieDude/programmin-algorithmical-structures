package cherevatyi.andrii;

import java.text.SimpleDateFormat;
import java.util.*;

public class LR1 {

    public static void main(String[] args) {
        System.out.println("Cherevatyi Andrii TR-15 LR-1 2021");
        System.out.printf("a = %.4f%n", calcR(1.426, -1.220));
        System.out.printf("b = %.4f%n", calcS(3.5));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the y: ");
        double y = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the z: ");
        double z = Double.parseDouble(scanner.nextLine());
        System.out.printf("a = %.4f%n", calcR(x, y));
        System.out.printf("b = %.4f%n", calcS(z));
        outputDate();
    }

    static double calcR(double x, double y) { return (2. * Math.cos(x - Math.PI / 6.)) / (1. / 2. + Math.pow(Math.sin(y), 2.)); }

    static double calcS(double z) { return 1. + Math.pow(z, 2.) / (3. + Math.pow(z, 2.) / 5.); }

    static void outputDate() { System.out.println("Current date is: " +
            new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime())); }

}