package practiceprogramsforjavadsa;

import java.util.Arrays;

public class SortedArrayCheck {
    public static void isArraySorted(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

                if (arr[i] > arr[i+1])
                {

                  System.out.println("Array is not sorted");

                  return;

                }
            }

        System.out.println("Array is sorted");

    }


    public static void main(String[] args) {

        int[] arr = {-1, 10, 20, 30, 40, 50, 60};

        isArraySorted(arr);
    }

}

