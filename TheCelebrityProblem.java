package practiceprogramsforjavadsa;

import java.util.Stack;

public class TheCelebrityProblem
{

    public static int findCeleb(int[] []arr, int n)
    {

        n = arr.length;

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++)
        {

            stk.push(i);
        }


        while(stk.size()>1)
        {

            int col = stk.pop();

            int row = stk.pop();

            if(arr[row][col]==1) stk.push(col);
            else stk.push(row);
        }


        int x = stk.pop();

        for(int j=0;j<n;j++)
        {

            if(j==x) continue;

            if(arr[x][j]==1) return -1;

        }


        for(int i=0;i<n;i++)
        {

            if(i==x) continue;

            if(arr[i][x]==0) return -1;

        }


        return x;

    }
}
