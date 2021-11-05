import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] arr, int element)
    {
        int first =0;
        int last = arr.length-1;
        while (first <=last)
        {
            int mid = (first + last)/2;

            if (element < arr[mid])
                last = mid -1;
            else if (element > arr[mid])
                first = mid +1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,34,8,3,0,76,33};
        Arrays.sort(arr);

        System.out.println( binarySearch(arr,2));
    }
}
