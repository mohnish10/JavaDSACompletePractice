package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class ElementWhichAppearsOnceInASortedArray4
{

    public static int elementWhichAppearsOnceInASortedArray(ArrayList<Integer> arr)
    {

       int n = arr.size();

       int first = arr.get(0);

       int last = arr.get(n-1);

       if(n==1) return first;

       if(first!=arr.get(1)) return first;

       if(last!=arr.get(n-2)) return last;

       int low = 1;

       int high = n-2;

       int mid;

       while(low<=high)
       {

           mid = (high+low)/2;

           if(!arr.get(mid).equals(arr.get(mid-1)) && !arr.get(mid).equals(arr.get(mid+1)))
               {

                   return arr.get(mid);
               }
               else if (mid%2==0 && arr.get(mid).equals(arr.get(mid+1)) || mid%2==1 && arr.get(mid).equals(arr.get(mid-1)))
               {

                   low = mid+1;
               }
               else
               {

                   high = mid-1;
               }



       }


       return -1;

    }
}
