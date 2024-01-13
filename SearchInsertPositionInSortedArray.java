package practiceprogramsforjavadsa;

public class SearchInsertPositionInSortedArray {

    public static int searchInsertPositionInASortedArray(int Arr[], int N, int k) {

        N = Arr.length;

        for (int i = 0; i < N; i++) {

            if (Arr[i] == k) {

                return i;
            }
            else if(Arr[i]>k)
            {

                return i;
            }

        }

        return Arr.length;
    }

        public static void main(String[]args)
        {

            int[] Arr = {1, 3, 5, 6};

            searchInsertPositionInASortedArray(Arr,Arr.length,4);
        }


}