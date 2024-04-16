package practiceprogramsforjavadsa;

import java.util.HashMap;
import java.util.Collections;

public class FindTheRowWithMaximum1s
{

    public static void findTheRowWithMax1s(int[][]arr) {

        int ans = -1;

        int m = arr.length;

        int n = arr[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            ans = rowWith1s(arr[i]);

            if (ans == -1) continue;
            else map.put(i, ans);

        }

        if (map.isEmpty()) {
            System.out.println(-1);

        } else {

            int max = Collections.max(map.values());

            for (int i = 0; i < map.size(); i++) {

                if (map.get(i) == max) {

                    System.out.println(i);

                    break;
                }

            }

        }

    }


    public static int rowWith1s(int[] arr1)
    {

        int ans = -1;

        int countOfOnes = 0;

        for(int i=0;i<arr1.length;i++)
        {

            if(arr1[i]==1)
            {

                countOfOnes++;

                ans = countOfOnes;

            }

        }

        return ans;

    }


    public static void main(String[] args)
    {

        int[][] arr = {{0,0,0},{0,0,0},{0,0,0,0}};

        findTheRowWithMax1s(arr);



    }
}