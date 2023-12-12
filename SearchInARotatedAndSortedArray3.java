package practiceprogramsforjavadsa;

import java.util.Scanner;

public class SearchInARotatedAndSortedArray3
{

    public static boolean searchInARotatedAndSortedArrayContainingDuplicates(int[] arr,int target)
    {

        int low = 0;

        int high = arr.length-1;

        while(low<=high)
        {

            int mid = (high+low)/2;

            if(arr[mid]==target) {
                return true;
            }


            if(arr[low]==arr[mid] && arr[mid]==arr[high])
            {

                low = low+1;
                high = high-1;
                continue;
            }

            if(arr[low]<=mid) {

                if (arr[low] <= target && target <= arr[mid]) {

                    high = mid - 1;
                } else {

                    low = mid + 1;
                }
            }
                else
                {

                    if(arr[mid]<=target && target<=arr[high])
                    {

                        low = mid+1;
                    }
                    else
                    {

                        high = mid-1;
                    }
                }
        }

        return false;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the key which you want to search");

        int key = sc.nextInt();

        int[] arr = {7,8,1,2,3,3,3,4,5,6};

        boolean found = searchInARotatedAndSortedArrayContainingDuplicates(arr,key);

        if(found)
        {

            System.out.println("Key is present in the array");
        }
        else
        {

            System.out.println("Key is not present in the array");

        }
    }
}
