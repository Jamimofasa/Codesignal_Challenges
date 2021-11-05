public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 1+i; j< nums.length;j++ )
            {
                if((nums[i]+nums[j]) == target && i!=j)
                {
                    temp[0] =i;
                    temp[1]=j;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] ints={3,2,4};

          int[]  intss =  twoSum(ints,6);
        for(int i: intss)
            System.out.println(i);
    }
}
