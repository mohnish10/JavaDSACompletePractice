package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class BookAllocationProblem2
{

    public static int countStudents(ArrayList<Integer> arr,int pages)
    {

        int student = 1;

        long pageCount = 0;

        int n = arr.size();

        for(int i=0;i<n;i++)
        {

            if(pageCount+arr.get(i)<=pages)
            {

                pageCount += arr.get(i);
            }
            else
            {

                student++;

                pageCount = arr.get(i);
            }
        }

        return student;
    }


    public static int getPages(ArrayList<Integer> arr,int m,int n)
    {

        n = arr.size();

        if(m>n) return -1;

        int maxi = Integer.MIN_VALUE;

        int sum = 0;

        for(int i=0;i<n;i++)
        {

            maxi = Math.max(maxi,arr.get(i));

            sum += arr.get(i);
        }

        int low = maxi; int high = sum;

        while(low<=high)
        {

            int mid = (low+high)/2;

            if(countStudents(arr,mid)>m) low = mid+1;
            else high=mid-1;

        }

        return low;
    }
}
