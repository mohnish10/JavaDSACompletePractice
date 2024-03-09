package practiceprogramsforjavadsa;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class AsteroidCollision
{

    public static List<Integer> collidingAsteroids(int[] asteroids)
    {

         Stack<Integer> stk = new Stack<>();

         int n = asteroids.length;

         for(int i=0;i<n;i++)
         {

             if(stk.isEmpty()) {stk.push(asteroids[i]);}
             else if(asteroids[i]>0 && stk.peek()>=0 || asteroids[i]<0 && stk.peek()<0 || stk.peek()<0 && asteroids[i]>0)
             {

                 stk.push(asteroids[i]);
             }
             else if(Math.abs(stk.peek())<Math.abs(asteroids[i]))
             {

                 stk.pop();
                 i--;
             }
             else if(Math.abs(stk.peek())>Math.abs(asteroids[i])) continue;
             else
             {

                 stk.pop();
             }

         }

         List<Integer> list = new ArrayList<>();

         while(!stk.isEmpty())
         {

             list.add(stk.pop());
         }

        Collections.reverse(list);

         return list;
    }
}
