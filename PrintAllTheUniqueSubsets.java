package practiceprogramsforjavadsa;

import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class PrintAllTheUniqueSubsets
{

    public static void printAns(List<String> ans)
    {

        System.out.println("The most unique subsets are:- ");

        System.out.print(ans.toString().replace(","," "));
    }


    public static void function(int[] nums,int index,List<Integer>ds,HashSet<String> res)
    {

        if(index==nums.length)
        {

            Collections.sort(ds);

            res.add(ds.toString());

            return;
        }


        ds.add(nums[index]);

        function(nums,index+1,ds,res);

        ds.remove(ds.size()-1);

        function(nums,index+1,ds,res);

    }


    public static List<String> subsetsWithDup(int[] nums)
    {

        List<Integer> ds = new ArrayList<>();

        HashSet<String> res = new HashSet<>();

        function(nums,0,ds,res);

        List<String> ans = new ArrayList<>();

        for (String it: res) {
            ans.add(it);
        }

        return ans;

    }


    public static void main(String[] args)
    {

        int[] nums = {1,2,2};

        List<String> list = subsetsWithDup(nums);

        printAns(list);

    }



}
