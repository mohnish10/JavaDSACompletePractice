package practiceprogramsforjavadsa;

import java.util.Arrays;

public class SortedArray
{

    public static void sortAndPrintTheArray(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

                if (arr[i+1] < arr[i]) {

                    int temp = arr[i];

                    arr[i] = arr[i+1];

                    arr[i+1] = temp;
                }

        }

        for (int i : arr) {

            System.out.print(i+" ");
        }

    }

        public static void main(String[] args)
        {

            int[] a = {10,0,-1,20,5,4,30,6};

            System.out.println("Original Array :- "+Arrays.toString(a));

            System.out.print("Sorted Array :- ");

            sortAndPrintTheArray(a);







        }



}
