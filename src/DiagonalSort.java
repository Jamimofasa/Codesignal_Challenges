import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiagonalSort {
    public static void main(String[] args) {
        int[][] arr = {{2,2,5,4},
                        {7,6,8,4},
                        {3,5,2,5},
                        {9,7,8,3}};


        sorDiag(arr);
        //print out new sorted arr
        for (int i =0; i< arr[0].length;i++)
        {
            for (int j =0; j< arr.length;j++)
            {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }
    public  static int[][] sorDiag(int[][]arr)
    {
        ArrayList<Integer> list =new ArrayList<>();
        ///sort col
        //sort last row
        int last =arr.length-1;
        for (int i = 1;i <arr.length;i++)
        {
            int k= i;

            for (int j=0; j<=i;j++)
            {
                list.add(arr[k][j]);
                k--;
            }
            Collections.sort(list);
            k= i;
            for (int j=0; j<=i;j++)
            {
                arr[k][j] = list.get(j);
                k--;
            }
            list.clear();
        }

        for (int i = 0;i <arr.length;i++)
        { int k= i;

            for (int j=last; j>=i;j--)
            {
                list.add(arr[k][j]);
                k++;
            }
            Collections.sort(list);
            k= i;
            for (int j=last; j>=i;j--)
            {
                arr[j][k] = list.get(last-j);
                k++;
            }
            list.clear();
        }

            return arr;
    }
}
