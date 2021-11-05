public class InsertionSort {

    public static void insertionSort(int [] arr)
    {
        for (int i = 1; i < arr.length;i++)
        {
            int value = arr[i];
            int j;
            for (j = i; j > 0 && arr[j-1] > value; j--)
            {
                arr[j]= arr[j-1];

            }
            arr[j] =value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,34,8,3,0,76,33};
//        bubbleSortAscend(arr);
        insertionSort(arr);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

    }
}
