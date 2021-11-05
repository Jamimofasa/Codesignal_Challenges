public class PancakeSort<T> {
    public static void flip(int[] arr, int k)
    {
        for(int i = 0; i < k/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1]= temp;
        }
    }
    public static int [] pancakeSort(int [] arr)
    {


        for (int i = arr.length-1; i >=0; i--) {
            int max=0;

            for (int j = i; j >= 0; j--) {
                if (arr[max] < arr[j])
                    max = j;

            }
            flip(arr,max+1);
            flip(arr,i+1);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] i = {3,6,2,9,5,7,45};
        pancakeSort(i);
        for(int k:i)
            System.out.println(k);
    }
    // {3,6,2,9,5,7,45}
    //T(n) = O(n^2)
}
