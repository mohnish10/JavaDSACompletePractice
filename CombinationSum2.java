package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2
{
    public static void findCombinations(int index,int[] arr,int target,List<List<Integer>>ans,List<Integer>ds)
    {

        if(target==0)
        {

            ans.add(new ArrayList<>(ds));

            return;
        }

        for(int i=index;i<arr.length;i++)
        {

            if(i>index&&arr[i]==arr[i-1]) continue;

            if(arr[index]>target) break;

            ds.add(arr[i]);

            findCombinations(i+1,arr,target-arr[i],ans,ds);

            ds.remove(ds.size()-1);

        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates,int target)
    {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        findCombinations(0,candidates,target,ans,new ArrayList<>());

        return ans;

    }


    public static void main(String[] args)
    {

        int[] v = {10,1,2,7,6,1,5};

        List<List<Integer>> list = combinationSum2(v,8);

        System.out.println(list.toString().replace(","," "));

    }
}
