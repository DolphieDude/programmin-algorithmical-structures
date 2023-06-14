package cherevatyi.andrii;
//пз-6
public class Main {

    public static void main(String[] args) {
        System.out.println(doubleChar("Hello Andrii"));
        System.out.println(sumDigits(234));
        System.out.println(catDog("1cat1cadodo"));
        System.out.println(endOther("abc", "abXabc"));
        System.out.println(withoutString("Hello there", "e"));
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i <=str.length()-1;i++) {
            result += str.charAt(i);
            result += str.charAt(i); }
        return result;
    }

    public static int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n/10);
    }

    public static boolean catDog(String str) {
        int len = str.length();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < len - 2; i++) {
            String temp = str.substring(i, i+3);
            if (temp.compareTo("cat") == 0)
            cat++;
            if (temp.compareTo("dog") == 0)
            dog++;
        }
        return (cat == dog);
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        int aLen = a.length();
        b = b.toLowerCase();
        int bLen = b.length();
        if (aLen < bLen) {
            String temp = b.substring(bLen - aLen, bLen);
            return temp.compareTo(a) == 0;
        } else {
            String temp = a.substring(aLen - bLen, aLen);
            return temp.compareTo(b) == 0;
        }
    }

    public static String withoutString(String base, String remove) {
        int blen = base.length();
        int rlen = remove.length();
        String result = "";
        for (int i = 0; i < blen; i++) {
            if (i <= blen - rlen) {
                String tmp = base.substring(i, i+rlen);
                if (!tmp.equals(remove))
                result += base.substring(i, i+1);
	      else {
                    i += rlen-1;
                }
            }
	    else {
                String tmp2 = base.substring(i, i+1);
                if (!tmp2.equals(remove))
                result += base.substring(i, i+1);
            }
        }
        return result;
    }
}
