package practiceprogramsforjavadsa;

public class PeakElement
{

    public static void peakElement(int[] arr)
    {

        int peakElement = 0;

        for(int i=1;i<arr.length-1;i++)
        {

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {

                peakElement = arr[i];

                System.out.println("Peak element is:- "+arr[i]);

            }
        }

        if(arr.length==1)
        {

            System.out.println("Peak element:- "+arr[0]);
        }

        if(arr[0]>=arr[1])
        {

            System.out.println("Peak element:- "+arr[0]);
        }

        if(arr[arr.length-1]>=arr[arr.length-2])
        {

            System.out.println("Peak element:- "+arr[arr.length-1]);
        }

    }

    public static void main(String[] args)
    {

        int[] arr = {5,10,20,15};

        peakElement(arr);
    }
}
