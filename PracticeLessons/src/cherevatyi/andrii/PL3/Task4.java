package cherevatyi.andrii.PL3;

public class Task4 {
    public static void main(String[] args) {
        Task1.printArray(zeroFront(new int[]{0, 1, 1, 0, 1, 0}));
    }
    static int[] zeroFront(int[] array) {
        int nOfZeros = 0;
        for (int i: array) if (i == 0) nOfZeros++;
        for (int i = array.length - 1; i > nOfZeros - 1; i--) {
            for (int j = array.length - 1; j > -1; j--) {
                if(array[j] != 0) array[i] = array[j];
            }
        }
        for (int i = 0; i < nOfZeros; i++) array[i] = 0;
        return array;
    }
}
