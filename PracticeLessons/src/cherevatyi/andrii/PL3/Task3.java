package cherevatyi.andrii.PL3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4}));
    }
    static boolean haveThree(int[] array) {
        int nOfThrees = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 3) {
                if (nOfThrees > 0 && array[i - 1] == 3) return false;
                nOfThrees++;
            }
        }
        return nOfThrees == 3;
    }
}
