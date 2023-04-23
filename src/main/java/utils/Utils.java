package utils;

public class Utils {
    private static void printLine() {
        System.out.println("========================================");
    }
    public static void printArray(int[][] array) {
        for (int[] items : array) {
            for (int item : items) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
    public static void printArray(int[][] array, String msg) {
        printLine();
        System.out.println(msg);
        printArray(array);
        printLine();
    }
}
