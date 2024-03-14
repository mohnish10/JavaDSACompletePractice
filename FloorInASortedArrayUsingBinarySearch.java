package practiceprogramsforjavadsa;

public class FloorInASortedArrayUsingBinarySearch {

    public static int floorInASortedArray(int[] a, int n, int x) {

        n = a.length;

        int low = 0;

        int high = n-1;

        int mid;

        int ans = -1;

        while (low < high) {

            mid = low + (high - low) / 2;

            if (a[mid] <= x) {

                ans = a[mid];

                low = mid + 1;
            } else if (x > a[mid]) {

                high = mid - 1;
            } else {

                return -1;
            }

        }

        return ans;

    }


    public static int ceilingInASortedArray(int[] a, int n, int x) {

        n = a.length;

        int low = 0;

        int high = n - 1;

        int mid;

        int ans = -1;

        while (low < high) {

            mid = low + (high - low) / 2;

            if (a[mid] >= x) {

                ans = a[mid];

                high = mid - 1;
            } else if (x < a[mid]) {

                low = mid + 1;
            } else {

                return -1;
            }

        }

        return ans;
    }


    public static int[] getFloorAndCeil(int[] a,int n,int x)
    {

        int floor = floorInASortedArray(a,n,x);

        int ceiling = ceilingInASortedArray(a,n,x);

        return new int[] {floor,ceiling};

    }






}