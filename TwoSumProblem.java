package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumProblem
{

    public static int twoSum(int[] arr,int target)
    {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {

            map.put(i,arr[i]);
        }


        for(int i=0;i<map.size();i++) {
            if (map.containsKey(i) && map.containsKey(i + 1)) {
                if (map.get(i) + map.get(i + 1) == target) {

                    System.out.print("Target is present as an addition of "+map.get(i) + " and  " + map.get(i + 1));

                    return 1;
                }
                }
            }

        return -1;

        }


    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6};

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the target which you want to search for as a sum of the array elements");

        int target = sc.nextInt();

        int result = twoSum(arr,target);

        if(result==-1)
        {

            System.out.println("Target is not present as an addition of the array elements");
        }
    }




}
