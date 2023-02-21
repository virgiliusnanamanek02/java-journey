package nana.learning.arrays;

public class Arrays {
    public static void main(String[] args) {
        // example of arrays and for loop
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[5]);

        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }
        System.out.println(java.util.Arrays.toString(myIntArray2));

        // example of enhanced for each loop

        int[] myIntArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : myIntArray3) {
            System.out.println(i);
        }

        // example of arrays and built-in methods

        int[] myIntArray4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(java.util.Arrays.toString(myIntArray4));
        System.out.println(java.util.Arrays.binarySearch(myIntArray4, 5));
        System.out.println(java.util.Arrays.binarySearch(myIntArray4, 11));
        System.out.println(java.util.Arrays.binarySearch(myIntArray4, 1));
        System.out.println(java.util.Arrays.binarySearch(myIntArray4, 10));
        System.out.println(java.util.Arrays.binarySearch(myIntArray4, 0));
        System.out.println(java.util.Arrays.binarySearch(myIntArray4, 6));

        // example of arrays and multi-dimensional arrays


        int[][] myMultiDimensionalArray = new int[10][10];
        for (int i = 0; i < myMultiDimensionalArray.length; i++) {
            for (int j = 0; j < myMultiDimensionalArray[i].length; j++) {
                myMultiDimensionalArray[i][j] = i * j;
            }
        }
        System.out.println(java.util.Arrays.deepToString(myMultiDimensionalArray));

        // example of arrays and multi-dimensional arrays with enhanced for each loop

        int[][] myMultiDimensionalArray2 = new int[10][10];
        for (int[] i : myMultiDimensionalArray2) {
            for (int j : i) {
                System.out.println(j);
            }
        }

        // example of arrays and multi-dimensional arrays with built-in methods

        int[][] myMultiDimensionalArray3 = new int[10][10];
        System.out.println(java.util.Arrays.deepToString(myMultiDimensionalArray3));


    }
}
