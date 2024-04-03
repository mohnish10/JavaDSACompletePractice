package practiceprogramsforjavadsa;

public class MinimumDaysToMakeMBouquets
{

    public static int roseGarden(int[] arr,int k,int m)
    {

        int n = arr.length;

        if(n<m*k) return -1;

        int minimum = Integer.MAX_VALUE;

        int maximum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {

            minimum = Math.min(minimum,arr[i]);

            maximum = Math.max(maximum,arr[i]);
        }

        for(int d=minimum;d<=maximum;d++)
        {

            if(possible(arr,d,m,k)) return d;

        }

        return -1;
    }


    public static boolean possible(int[] arr,int day,int m,int k)
    {

        int n = arr.length;

        int count = 0;

        int noOfBouquets = 0;

        for (int j : arr) {

            if (j <= day) {
                count++;
            } else {

                noOfBouquets += (int) Math.floor((double) count / (double) k);

                count = 0;

            }

        }

        noOfBouquets += (int) Math.floor((double)count/(double)k);

        return noOfBouquets >= m;

    }
}
