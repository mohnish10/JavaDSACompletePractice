package practiceprogramsforjavadsa;

import java.util.ArrayList;

public class FindTheRowWithMaximum1s2
{

    public static int findMost1s(ArrayList<ArrayList<Integer>> matrix,int n,int m)
    {

        int cntMax = 0;

        int index = -1;

        for(int i=0;i<n;i++)
        {

            int cntOnes = 0;

            for(int j=0;j<m;j++)
            {

                cntOnes += matrix.get(i).get(j);

            }

            if(cntOnes>cntMax)
            {

                cntMax = cntOnes;

                index = i;

            }

        }


        return index;

    }
}
