package practiceprogramsforjavadsa;

public class SearchInARowAndColumnSortedMatrix2
{

    public static boolean searchElement(int[][]MATRIX,int target)
    {

        int n = MATRIX.length;

        int m = MATRIX[0].length;

        int rows = 0; int cols = m-1;

        while(rows<n && cols>=0)
        {

            if(MATRIX[rows][cols]==target) return true;
            else if(MATRIX[rows][cols]>target) cols--;
            else rows++;

        }

        return false;

    }
}
