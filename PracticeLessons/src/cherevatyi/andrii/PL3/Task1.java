package cherevatyi.andrii.PL3;

public class Task1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        printArray(middleWay(array1, array2));
    }
    static int[] middleWay(int[] first, int[] second) {
        int[] result = new int[2];
        result[0] = first[1];
        result[1] = second[1];
        return result;
    }
    public static void printArray(int[] array) {
        System.out.print("{");
        for (int element:array) {
            System.out.print(element + ";");
        }
        System.out.println("}");
    }
}