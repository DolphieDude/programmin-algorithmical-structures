package cherevatyi.andrii;

public class Task_5 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (20 - 0 + 1) + 0); //rnd * (max - min + 1) + min
        System.out.println("a = " + a);
        int b = (int) (Math.random() * (20 - 0 + 1) + 0); //rnd * (max - min + 1) + min
        System.out.println("b = " + b);
        System.out.println(close10(a, b));
    }

    static int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) return a;
        else if (Math.abs(10 - a) > Math.abs(10 - b)) return b;
        else return 0;
    }
}
