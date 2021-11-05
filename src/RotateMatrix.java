public class RotateMatrix {



    public static void main(String[] args) {
        int[][] x = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int[][] a = new int[x.length][x[0].length];
        for (int i =0; i< x.length;i++)
        {
            for (int j =0; j< x.length;j++)
            {
                a[i][x.length-j-1]=x[j][i];

            }
        }
//    input 1 2 3     OUTPUT 7 4 1
//          4 5 6            8 5 2
//          7 8 9            9 6 3


        for (int i =0; i< x[0].length;i++)
        {
            for (int j =0; j< x.length;j++)
            {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
    }
}
