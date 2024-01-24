package practiceprogramsforjavadsa;

public class SortAnArrayOf0s1sAnd2s
{

    public static void sortArrayOf0s1sAnd2s(int[] arr)
    {

        int zeroCount=0,oneCount=0,twoCount=0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==0)
            {

                zeroCount++;
            }
            else if(arr[i]==1)
            {

                oneCount++;
            }
            else
            {

                twoCount++;
            }
        }

        System.out.println();

        System.out.println("Count of 0s "+zeroCount);

        System.out.println("Count of 1s "+oneCount);

        System.out.println("Count of 2s "+twoCount);

        for(int i=0;i<zeroCount;i++)
        {

            arr[i]=0;
        }

        for(int j = zeroCount;j<arr.length-twoCount;j++)
        {

            arr[j]=1;

        }

        for(int k = (arr.length-twoCount);k<arr.length;k++)
        {

            arr[k]=2;

        }

        System.out.print("Array after sorting of 0s,1s and 2s- ");

        for(int i:arr)
        {

            System.out.print(i+" ");
        }

    }


    public static void main(String[] args)
    {

       int[] arr = { 0, 1, 2, 1, 0, 1, 0, 2, 1, 0 };

        sortArrayOf0s1sAnd2s(arr);


    }
}
