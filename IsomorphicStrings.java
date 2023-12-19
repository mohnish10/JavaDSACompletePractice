package practiceprogramsforjavadsa;

import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings
{

    public static boolean isomorphicStrings(String s,String t) {

        if (s.length() < t.length() || s.length() > t.length()) {

            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();

        Map<Character, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Character ch1 = s.charAt(i);

            Character ch2 = t.charAt(i);

            if (map1.containsKey(ch1) == true) {

                if (map1.get(ch1) != ch2) {

                    return false;
                }
            } else if (map2.containsKey(ch2)) {

                return false;
            } else {

                map1.put(ch1, ch2);

                map2.put(ch2, true);
            }

        }

        return true;

    }


    public static void main(String[] args)
    {


    }
}
