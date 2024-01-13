package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeSumProblem
{
    public static List<Integer> threeSum(int[] arr,int target)
    {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {

                for(int k=j+1;k<arr.length;k++)
                {

                    if(arr[i]+arr[j]+arr[k]==target)
                    {

                        list.add(arr[i]);

                        list.add(arr[j]);

                        list.add(arr[k]);
                    }
                }
            }
        }

        return list;
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target which you are looking for");

        int target = sc.nextInt();

        int[] arr = {12, 3, 4, 1, 6, 9};

        List<Integer> result = threeSum(arr,target);

        if(result.isEmpty())
        {

            System.out.println("The target is not present in the array");
        }
        else
        {

            System.out.println("The indices of the target "+target+" are "+result);
        }

    }
}
