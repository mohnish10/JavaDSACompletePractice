package practiceprogramsforjavadsa;

public class FirstAndLastPositionsOfAnElement2
{

    public static void firstAndLastPositionsOfAnElement(int[] arr,int target)
    {

        int firstOccurrence = 0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==target)
            {

                firstOccurrence = i;

                System.out.println("First occurrence of target is:- "+i);

                break;
            }
        }

        int count = firstOccurrence;


        for(int i=firstOccurrence;i<arr.length-1;i++)
        {

            if(arr[i+1]==target)
            {

                count++;

            }
        }

        System.out.println("Last occurrence of target is:- "+count);

    }


    public static void main(String[] args)
    {

        int[] arr = {1, 3, 5, 5, 5, 5, 7, 123, 125};

        firstAndLastPositionsOfAnElement(arr,7);
    }

}
