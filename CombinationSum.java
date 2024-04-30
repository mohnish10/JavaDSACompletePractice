package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;

public class CombinationSum
{

    private void findCombinations(int index,int[] arr,int target,List<List<Integer>>ans,List<Integer>ds)
    {

        if(index==arr.length)
        {

            if(target==0) {
                ans.add(new ArrayList<>(ds));
            }

            return;
        }

        if(arr[index]<=target)
        {

            ds.add(arr[index]);

            findCombinations(index,arr,target-arr[index],ans,ds);

            ds.remove(ds.size()-1);
        }


        findCombinations(index+1,arr,target,ans,ds);

    }


    public List<List<Integer>> combinationSum(int[] candidates,int target)
    {

        List<List<Integer>> ans = new ArrayList<>();

        findCombinations(0,candidates,target,ans,new ArrayList<>());

        return ans;

    }


    public static void main(String[] args)
    {

        int[] arr = {2,3,6,7};

        int target = 7;

        CombinationSum cs = new CombinationSum();

        List<List<Integer>> ls = cs.combinationSum(arr,target);

        System.out.println("Combinations are:- ");

        for(int i=0;i<ls.size();i++)
        {

            for(int j=0;j<ls.get(i).size();j++)
            {

                System.out.print(ls.get(i).get(j)+" ");

            }

            System.out.println();

        }

    }
}
