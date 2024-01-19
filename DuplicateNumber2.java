package practiceprogramsforjavadsa;

import java.util.Arrays;

public class DuplicateNumber2
{

    public static int findDuplicate(int[] arr)
    {

        Arrays.sort(arr);

        int duplicateNumber = -1;

        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i]==arr[i+1])
            {

                return arr[i];

            }
        }

        return duplicateNumber;
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
