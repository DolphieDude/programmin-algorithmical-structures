package cherevatyi.andrii;
import static java.lang.Math.*;

public class LR21 {

    public static void main(String[] args) {
        double x1 = -2.3;
        double x2 = 0.6;
        double x3 = 4.8;
        System.out.printf("y(x1) = %.4f\n", task1(x1));
        System.out.printf("y(x2) = %.4f\n", task1(x2));
        System.out.printf("y(x3) = %.4f\n", task1(x3));
        System.out.printf("2y(x1), a1, b1 = %.4f\n", task2(x1, 1));
        System.out.printf("2y(x2), a1, b1 = %.4f\n", task2(x2, 1));
        System.out.printf("2y(x3), a1, b1 = %.4f\n", task2(x3, 1));
        System.out.printf("2y(x1), a2, b2 = %.4f\n", task2(x1, 2));
        System.out.printf("2y(x2), a2, b2 = %.4f\n", task2(x2, 2));
        System.out.printf("2y(x3), a2, b2 = %.4f\n", task2(x3, 2));
        System.out.printf("2y(x1), a3, b3 = %.4f\n", task2(x1, 3));
        System.out.printf("2y(x2), a3, b3 = %.4f\n", task2(x2, 3));
        System.out.printf("2y(x3), a3, b3 = %.4f\n", task2(x3, 3));
    }
    static double task1(double x) {
        double a = 0.2;
        double b = 12.5;
        double z = pow(2.5 + b, 2.);
        double y = 0;
        if (x <= a) {
            y = a + sin(b * x) + pow(cos(x), 2.);
        }
        else if (x > a && x < log(b)) {
            y = sqrt(a + b * x) + sin(z * x);
        }
        else if (x >= log(b)) {
            y = log(a + b * x + z);
        }
        return y;
    }
    static double task2(double x, int which) {
        double a, b;
        switch (which) {
            case 1:
                a = -1.2;
                b = 0.75;
                break;
            case 2:
                a = 0.4;
                b = 2.4;
                break;
            case 3:
                a = 1.1;
                b = 6.1;
                break;
            default:
                a = 0;
                b = 0;
        }
        double z = log(abs(tan(b * x)));
        double y = 0;
        if (x <= a) {
            y = a + sin(b * x) + pow(cos(x), 2.);
        }
        else if (x > a && x < log(b)) {
            y = sqrt(a + b * x) + sin(z * x);
        }
        else if (x >= log(b)) {
            y = log(a + b * x + z);
        }
        return y;
    }
}
