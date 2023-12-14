package practiceprogramsforjavadsa;

import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class LongestConsecutiveSubsequence
{

    public static int longestConsecutiveSubsequence(Integer[] arr)
    {

        int count = 1;

        int maxConsCount = 0;

        Arrays.sort(arr);

        Set<Integer> set = new LinkedHashSet<>(List.of(arr));

        ArrayList<Integer> list = new ArrayList<>(set);

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int i=0;i<list.size()-1;i++)
        {

            if(list.get(i+1)==list.get(i)+1)
            {

                count++;
            }
            else
            {

                count = 0;
            }

            maxConsCount = Math.max(count,maxConsCount);
        }

        System.out.println("The longest subsequence present in the array is:- "+list1.toString());

        return maxConsCount;

    }


    public static void main(String[] args)
    {

        Integer[] arr = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};

        int result = longestConsecutiveSubsequence(arr);

        System.out.println("The longest consecutive subsequence count is:- "+result);
    }
}
