package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;


public class RightRotateArray
{

    public static void rightRotate(int[] nums,int k)
    {

        if(k>=nums.length)
        {

            k = k%nums.length;
        }

        System.out.println(k);

        List<Integer> list = new ArrayList<>();

        for(int i=nums.length-k;i<nums.length;i++)
        {

            list.add(nums[i]);
        }

        for(int i=0;i<nums.length-k;i++)
        {

            list.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {

            nums[i]=list.get(i);
        }



    }


    public static void main(String[] args)
    {

        int[] arr = {-1};

        rightRotate(arr,2);

    }
}
