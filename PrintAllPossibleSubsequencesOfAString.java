package practiceprogramsforjavadsa;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllPossibleSubsequencesOfAString
{

    public static ArrayList<String> allPossibleValues(String s)
    {

        int n = s.length();

        ArrayList<String> ans = new ArrayList<>();

        for(int num = 0;num<(1<<n);num++)
        {

            String sub = "";

            for(int i=0;i<n;i++)
            {

                if((num & (1<<i))!=0) sub += s.charAt(i);

            }

            if(!sub.isEmpty()) ans.add(sub);

        }


        Collections.sort(ans);

        return ans;

    }
}
