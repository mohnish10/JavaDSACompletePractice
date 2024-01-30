package practiceprogramsforjavadsa;

public class DailyTemperatures
{

    public static int[] dailyTemperatures(int[] temperatures)
    {

        int n = temperatures.length;

        int[] answer = new int[n];

        for(int i=0;i<n;i++) {

            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {

                    answer[i] = j - i;

                    break;
                } else {

                    answer[i] = 0;

                }


            }

        }

        return answer;
    }


    public static void main(String[] args)
    {

        int[] temperatures = {73,74,75,71,69,72,76,73};

        System.out.print("Original array:- ");

        for(int i:temperatures)
        {

            System.out.print(i+" ");
        }

        System.out.println();

        int[] result = dailyTemperatures(temperatures);

        for(int i:result)
        {

            System.out.print(i+" ");
        }


    }
}
