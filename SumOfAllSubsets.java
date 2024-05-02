package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfAllSubsets
{
    public static void subsetSumsHelper(int index,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer>sumSubset)
    {

        if(index==N)
        {

            sumSubset.add(sum);

            return;

        }


        subsetSumsHelper(index+1,sum+arr.get(index),arr,N,sumSubset);

        subsetSumsHelper(index+1,sum,arr,N,sumSubset);

    }


    static ArrayList<Integer> subsetSums(ArrayList<Integer>arr,int N)
    {

        ArrayList<Integer> sumSubset = new ArrayList<>();

        subsetSumsHelper(0,0,arr,N,sumSubset);

        Collections.sort(sumSubset);

        return sumSubset;

    }


    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);

        arr.add(2);

        arr.add(1);

        ArrayList<Integer> ans = subsetSums(arr,arr.size());

        Collections.sort(ans);

        System.out.println("The sum of each subset is:- ");

        for(int i=0;i<ans.size();i++)
        {

            System.out.print(ans.get(i)+" ");
        }

    }
}
