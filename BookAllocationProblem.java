package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class BookAllocationProblem
{

    public static int countStudents(ArrayList<Integer> arr,int pages)
    {

        int student = 1;

        long pageStudents = 0;

        int n = arr.size();

        for(int i=0;i<n;i++)
        {

            if(pageStudents+arr.get(i)<=pages) pageStudents += arr.get(i);
            else
            {

                student++;

                pageStudents = arr.get(i);
            }

        }

        return student;
    }


    public static int findPages(ArrayList<Integer> arr, int n,int m)
    {

        if(m>n) return -1;

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        n = arr.size();

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,arr.get(i));

            sum += arr.get(i);
        }

        for(int i=maxi;i<=sum;i++)
        {

            if(countStudents(arr,i)==m) return i;

        }

        return maxi;

    }
}
