public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,7,34,8,3,0,76,33};
//        bubbleSortAscend(arr);
        flip(arr);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

    }

    /*flip array from back to front
    i.e arr = {2,7,34,8,3,0,76,33};
    to  arr = {33,76,0,3,8,34,7,2}
    * */
    public static void flip(int[] arr)
    {
        int k = arr.length;
        for (int i = 0; i < k/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[k -i -1];
            arr[k -i -1] = temp;
        }
    }

    public static void bubbleSortAscend(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void bubbleSortDescend(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
