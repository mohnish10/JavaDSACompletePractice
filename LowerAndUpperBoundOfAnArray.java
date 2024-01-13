package practiceprogramsforjavadsa;

public class LowerAndUpperBoundOfAnArray
{

    public static int lowerBoundOfAnArray(int[] arr,int element)
    {

        int lowerBound = 0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==element)
            {

                lowerBound=i;

                break;
            }

        }

        return lowerBound;

    }


    public static int upperBoundOfAnArray(int[] arr,int element)
    {

        int lowerBound = lowerBoundOfAnArray(arr,element);

        int upperBound = 0;

        for(int i=lowerBound;i<arr.length-1;i++)
        {

            if(arr[i+1]==element)
            {

                upperBound=i+1;

            }
        }

        return upperBound;
    }


    public static void main(String[] args)
    {

        int[] arr = {1,1,1,2,3,3,3,3,4,4};

        int result = lowerBoundOfAnArray(arr,1);

        int upperResult = upperBoundOfAnArray(arr,1);

        System.out.println("Lower bound and upper bound of the element is:- "+result+" and "+upperResult);
    }



}
