package practiceprogramsforjavadsa;

import java.util.Arrays;

public class MedianOfRowwiseSortedMatrix
{

    public static int medianOfRowwiseSortedMatrix(int[][]arr,int row,int col)
    {

        int[] result = new int[row*col];

        int index = 0;

        for(int i=0;i<row;i++)
        {

            for(int j=0;j<col;j++)
            {

                result[index++] = arr[i][j];
            }

        }

        Arrays.sort(result);

        return result[(row*col)/2];

    }
}
