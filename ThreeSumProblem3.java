package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSumProblem3
{

    public static List<Integer> threeSum(int[] arr,int target)
    {

        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {

            map.put(i,arr[i]);

        }

        for(int i=0;i<map.size();i++)
        {

            if(map.containsKey(i) && map.containsKey(i+1) && map.containsKey(i+2))
            {

                if(map.get(i)+map.get(i+1)+map.get(i+2)==target)
                {

                    list.add(map.get(i));

                    list.add(map.get(i+1));

                    list.add(map.get(i+2));
                }

            }
        }

        return list;

    }


    public static void main(String[] args)
    {

        int[] arr = {1,4,45,6,10,8};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target which you are looking for in the array");

        int target = sc.nextInt();

        List<Integer> list = threeSum(arr,target);

        if(list.isEmpty())
        {

            System.out.println("The target is not present in the array");
        }
        else
        {

            System.out.println("The indices of the target "+target+" are"+list.toString());
        }
    }
}
