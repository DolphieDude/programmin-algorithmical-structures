package cherevatyi.andrii.PL3;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[] {5, 7, 2, 3, 4, 2, 3}));
    }
    static int maxTriple(int[] array) {
        if (array.length == 1) return 0;
        else if (array[0] > array[array.length - 1] && array[0] > array[array.length / 2])
            return array[0];
        else if(array[array.length - 1] > array[0] && array[array.length - 1] > array[array.length / 2])
            return array[array.length - 1];
        else return array[array.length / 2];
    }
}
