package practiceprogramsforjavadsa;

public class SearchInsertPositionInSortedArray {

    public static void searchInsertPositionInASortedArray(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {

                System.out.println("Element found at index "+i);

                return;
            }

        }

        for (int j = 1; j < arr.length - 1; j++) {

            if (element > arr[j-1] && element < arr[j + 1]) {

                System.out.println("Element can be present at index "+j);

            }
        }

        if(element<arr[0] || element>arr[arr.length-1])
        {

            System.out.println("Element cannot be placed as it is out of bounds");
        }

    }

        public static void main(String[]args)
        {

            int[] arr = {1, 3, 5, 6};

            searchInsertPositionInASortedArray(arr, 5);
        }


}