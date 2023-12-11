package practiceprogramsforjavadsa;

import java.util.List;
import java.util.ArrayList;

public class FloorInASortedArray
{

    public static int floorSortedArray(Integer[] arr,int x)
    {

      List<Integer> list = new ArrayList<>();

      if(x<arr[0])
      {

          return -1;
      }

      if(x>=arr[arr.length-1])
      {

          return arr[arr.length-1];
      }

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<=x)
            {

                list.add(arr[i]);

            }
        }

        int floor = list.get(0);

        for(int j=0;j<list.size();j++)
        {

            if(floor<=list.get(j))
            {

                floor = list.get(j);

                return floor;
            }
        }

        return -1;
    }


    public static void main(String[] args)
    {

        Integer[] arr = {1, 2, 8, 10, 10, 12, 19};

        int floor = floorSortedArray(arr,1);

        if(floor==-1)
        {

            System.out.println("Floor does not exist");
        }
        else
        {

            System.out.println("Floor is:- "+floor);
        }
    }

}
