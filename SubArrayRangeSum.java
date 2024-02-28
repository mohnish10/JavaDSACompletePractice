package practiceprogramsforjavadsa;

public class SubArrayRangeSum
{

    public static int subArrayRangeSum(int[] nums)
    {

            int n = nums.length;

            long sum = 0;

            for(int i=0;i<n;i++)
            {

                int minEle = nums[i];

                int maxEle = nums[i];

                for(int j=i;j<n;j++)
                {

                    minEle = Math.min(minEle,nums[j]);

                    maxEle = Math.max(maxEle,nums[j]);

                    int middle = maxEle-minEle;

                    sum += middle;
                }

            }

            return (int) (sum%(Math.pow(10,9)+7));

    }
}
