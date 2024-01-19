package practiceprogramsforjavadsa;

public class DuplicateNumber
{

    public static int findDuplicate(int[] nums)
    {

        int duplicateNum = -1;

        for(int i=0;i<nums.length;i++)
        {

            for(int j=i+1;j<nums.length;j++)
            {

                if(nums[i]==nums[j])
                {

                    duplicateNum = nums[i];

                    break;
                }
            }
        }

        return duplicateNum;

    }


    public static void main(String[] args)
    {

        int[] arr = {1,3,4,2,2};

        System.out.print("The original array is:- ");

        for(int i:arr)
        {

            System.out.print(i+" ");

        }

        System.out.println();

        int duplicateNum = findDuplicate(arr);

        System.out.println("Duplicate number is:- "+duplicateNum);

    }
}
