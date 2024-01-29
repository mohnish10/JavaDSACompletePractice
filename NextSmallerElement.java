package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextSmallerElement
{

    public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr)
    {

        int n = arr.size();

        int[] result = new int[n];

        result[n-1] = -1;

        for(int i=0;i<n;i++)
        {

            for(int j=i+1;j<n;j++)
            {

                if(arr.get(j)<arr.get(i))
                {

                    result[i]=arr.get(j);

                    break;
                }
                else
                {

                    result[i]=-1;
                }

            }
        }

        ArrayList<Integer> finalResult = new ArrayList<>();

        for(int i=0;i<result.length;i++)
        {

            finalResult.add(result[i]);
        }

        return finalResult;
    }


    public static void main(String[] args)
    {

        List<Integer> arr1 = Arrays.asList(4, 8, 5, 2, 25);

        System.out.print("Original array:- ");

        for(int i=0;i<arr1.size();i++)
        {

            System.out.print(arr1.get(i)+" ");
        }

        System.out.println();

        ArrayList<Integer> result = nextSmallerElement((ArrayList<Integer>) arr1);

        for(int i:result)
        {

            System.out.print(i+" ");
        }
    }
}
