import java.util.Arrays;
import java.util.List;

public class MedianTwoArrays {
    public static double  findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merged = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
      if (merged.length%2 == 0)
      {
          return (double) (merged[merged.length/2 -1] + merged[merged.length/2 ])/2;
      }
        return (merged[merged.length/2 ]);

    }

    public static void main(String[] args) {

        int[] n1 ={1,3};
        int[] n2 ={2,4};

        System.out.println(findMedianSortedArrays(n1,n2));
    }
}
