package cherevatyi.andrii;

public class Main {

    public static void main(String[] args) {
        double xmin = -2.;
        double xmax = 5.;
        double h = 0.2;
        task1(xmin, xmax, h);
        double[] seq = {-1.6000, 8.0909, -16.2042, 22.0381, -26.6817, 34.0674, 41.4691, -47.3470, 53.6836, -58.0048};
        System.out.print("Послідовність: ");
        for (double e : seq) {
            System.out.printf("%.4f; ", e);
        }
        System.out.println();
        double[] task2Result = task2(seq);
        System.out.printf("Сума від'ємних: %.4f; Кількість додатніх: %d\n\n", task2Result[0], (int) task2Result[1]);
        double[] seq2 = {1.6000, -8.0909, 16.2042, -22.0381, 26.6817, -34.0674, -41.4691, 47.3470, -53.6836, -58.0048};
        System.out.print("Послідовність: ");
        for (double e : seq2) {
            System.out.printf("%.4f; ", e);
        }
        System.out.println();
        task2Result = task2(seq2);
        System.out.printf("Сума від'ємних: %.4f; Кількість додатніх: %d\n\n", task2Result[0], (int) task2Result[1]);
        double x1 = 0.6, x2 = 2.8;
        System.out.printf("Відповідь при x = %.1f: %.4f\n", x1, task3(x1));
        System.out.printf("Відповідь при x = %.1f: %.4f", x2, task3(x2));
    }

    static void task1(double xmin, double xmax, double h) {
        double y, z;
        System.out.println("_______________________");
        System.out.println("| x |  y(x)  |  z(x)  |");
        for (double x = xmin; x <= xmax; x += h) {
            y = 2.5 * Math.sin(x / 2.);
            z = Math.sin(x) / Math.log(x + 4.);
            System.out.printf("|%.1f| %.4f | %.4f |\n", x, y, z);
        }
        System.out.println("_______________________\n");
    }

    static double[] task2(double[] seq) {
        double sum = 0;
        int howManyPositives = 0;
        for (double e: seq) {
            if (e < 0) sum += e;
            else if(e > 0) howManyPositives++;
        }
        return new double[] {sum, howManyPositives};
    }
    
    static double task3(double x) {
        double k = 1;
        double kmax = 5;
        double factorial;
        double sum = 0;
        for (; k <= kmax; k++) {
            factorial = 1;
            int j = 1;
            while(j <= 2 * k) j++; factorial *= j;
            sum += (Math.pow(-1., k) * factorial) / (4.5 * Math.pow(x, 2. * k - 1.));
        }
        return sum;
    }
}
