package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class SearchInASorted2dMatrix1
{

    public static boolean searchInASorted2dMatrix(ArrayList<ArrayList<Integer>> mat,int target)
    {

        int n = mat.size();

        int m = mat.get(0).size();

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<m;j++)
            {

                if(mat.get(i).get(j)==target) return true;

            }

        }


        return false;

    }
}
