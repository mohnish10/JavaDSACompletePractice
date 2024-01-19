package practiceprogramsforjavadsa;

public class SquaresOfASortedArray2
{

    public static int[] squaresOfASortedArray(int[] nums)
    {

        int left = 0;

        int right = nums.length-1;

        int[] result = new int[nums.length];

        for(int i=nums.length-1;i>=0;i--)
        {

            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {

                result[i] = nums[left] * nums[left];

                left++;

            }
            else
            {

                result[i] = nums[right] * nums[right];

                right--;
            }
        }


        for(int i=0;i<nums.length;i++)
        {

            nums[i] = result[i];
        }

         return nums;

    }


    public static void main(String[] args)
    {

        int[] arr = {-6, -3, -1, 2, 4, 5};

        System.out.print("Original array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] result = squaresOfASortedArray(arr);

        System.out.print("Sorted squared array is:- ");

        for(int i:result)
        {

            System.out.print(i+" ");
        }

    }
}
