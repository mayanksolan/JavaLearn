
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        int ind = 0, small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int ind = index, small = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int indSmallest = indexOfTheSmallestStartingFrom(array, i + 1);
            //System.out.println("index:"+indSmallest+" value:"+array[indSmallest]);
            if (array[i] > array[indSmallest]) {
                swap(array, i, indSmallest);
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
