package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class MedianOf2SortedArrays
{

    public static double median(int[] a,int[] b)
    {

        int n1 = a.length;

        int n2 = b.length;

        double median;

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;

        int j = 0;

        while(i<n1 && j<n2)
        {

            if(a[i]<b[j])
            {

                list.add(a[i++]);
            }
            else
            {

                list.add(b[j++]);
            }

        }


        while(i<n1){
            list.add(a[i++]);
        }

        while(j<n2){
            list.add(b[j++]);
        }

        int n = n1+n2;

        if(n%2==1)
        {

         median = list.get(n/2);
        }
        else
        {

            median = ((double)list.get(n/2)+(double)list.get(n/2-1))/2.0;
        }


     return median;

    }
}
