package practiceprogramsforjavadsa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchInARotatedSortedArray
{

    public static int searchInARotatedAndSortedArray(ArrayList<Integer> arr,int target)
    {
        int n = arr.size();

        int low = 0;

        int high = n-1;

        while(low<=high) {
            int mid = (low + high) / 2;

            if (arr.get(mid) == target)
                return mid;

            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= target && target <= arr.get(mid)) {

                    high = mid - 1;
                } else {

                    low = mid + 1;
                }

            } else {

                if (arr.get(mid) <= target && target <= arr.get(high)) {

                    low = mid + 1;
                } else {

                    high = mid - 1;
                }
            }

        }

return -1;

    }

    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,8,9,1,2,3,4,5,6));

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the element which you want to search:- ");

        int key = sc.nextInt();

        int res = searchInARotatedAndSortedArray(list,key);

        if(res==-1)
        {

            System.out.println("Target is not present in the array");
        }
        else
        {

            System.out.println("Target "+key+" is present at "+res);
        }

    }
}
