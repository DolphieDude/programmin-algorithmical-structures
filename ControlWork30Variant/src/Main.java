public class Main {

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
        System.out.println(getSum(0.6));
    }
    static String mixString(String a, String b) {
        int len;
        String result = "";
        if (a.length() >= b.length()) len = a.length();
        else len = b.length();
        for (int i = 0; i < len; i++) {
            if (i < a.length() && i >= b.length()) result += a.charAt(i);
            else if (i >= a.length() && i < b.length()) result += b.charAt(i);
            else result = result + a.charAt(i) + b.charAt(i);
        }
        return result;
    }

    static double getSum(double x) {
        double k = 1;
        double kmax = 5;
        double factorial;
        double sum = 0;
        for (; k <= kmax; k++) {
            if (k == 4) k++;
            factorial = 1;
            int j = 1;
            while(j <= (k - 1)) j++; factorial *= j;
            sum += (Math.pow(-1., 2. * k + 1.) * factorial) / (Math.pow(x + 1, k + 2.));
        }
        return sum;
    }
}
