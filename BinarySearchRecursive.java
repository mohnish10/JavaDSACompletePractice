package practiceprogramsforjavadsa;

public class BinarySearchRecursive
{

    public static int binarySearchRecursive(int[] arr, int low, int high, int target)
    {

        if(low>high) {
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid]==target) return mid;
        else if(target>arr[mid])
        return binarySearchRecursive(arr,mid+1,high,target);
        else
        return binarySearchRecursive(arr,low,mid-1,target);

    }

    public static void main(String[] args)
    {

        int[] arr = {2,4,6,10,12};

        System.out.println(binarySearchRecursive(arr,0,arr.length-1,17));
    }


}
