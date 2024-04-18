package practiceprogramsforjavadsa;

public class MedianOfRowwiseSortedMatrix2
{
    public static int countSmallerThanMid(int[]A,int mid,int n)
    {

        int low = 0; int high = n-1;

        while(low<=high)
        {

            int md = (low+high)>>1;

            if(A[md]<=mid) low = md+1;
            else high = md-1;

        }

        return low;

    }


    public static int findMedian(int[][]A,int row,int col)
    {

        int low = 1; int high = 1000000000;

        int n = row; int m = col;

        while(low<=high)
        {

            int mid = (low+high)>>1;

            int cnt = 0;

            for(int i=0;i<n;i++) cnt += countSmallerThanMid(A[i],mid,col);

            if(cnt<=(m*n/2)) low = mid+1;
            else high = mid-1;

        }

        return low;

    }
}
