package cherevatyi.andrii;

public class Main {

    public static void main(String[] args) {
        String str = "abcxx";
        System.out.println("Task1 \"abcxx\": " + task1(str));
        str = "xxx";
        System.out.println("Task1 \"" + str + "\": " + task1(str));
        str = "xxxx";
        System.out.println("Task1 \"" + str + "\": " + task1(str));
        double x = 0.6;
        System.out.printf("Task2(x = " + x + ") = %.4f", task2(x));
    }

    static int task1(String str) {
        int lettersCounter = 0;
        int howMany = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && lettersCounter == 0) {
                lettersCounter++;
            }
            else if (str.charAt(i) == 'x' && lettersCounter == 1) {
                howMany++;
            }
            else {
                lettersCounter = 0;
            }
        }
        return howMany;
    }

    static double task2(double x) {
        int k = 1;
        int kmax = 5;
        double factorial;
        double sum = 0;
        for (; k <= kmax; k++) {
            if (k == 3) k++;
            factorial = 2.;
            int i = 2;
            while(i <= k) {
                factorial *= 2. * k;
                i++;
            }
            sum += (Math.pow(-1., k + 1.) * Math.pow(x + k, 2. * k)) / factorial;
        }
        return sum;
    }
}
