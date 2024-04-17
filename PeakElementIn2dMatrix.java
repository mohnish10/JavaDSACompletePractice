package practiceprogramsforjavadsa;

import java.util.Arrays;

public class PeakElementIn2dMatrix
{

    public static int[] peakElementIn2dMatrix(int[][]G) {

        int n = G.length;

        int m = G[0].length;

        int max = Integer.MIN_VALUE;

        int[] result = new int[2];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (G[i][j] > max) {
                    max = G[i][j];

                    result[0] = i;

                    result[1] = j;

                }

            }

        }

        return result;

    }


    public static void main(String[] args)
    {

        int[][] mat = {{8,6},{10,1}};

        int[] result = new int[2];

        result = peakElementIn2dMatrix(mat);

        System.out.println(Arrays.toString(result));





    }
}
