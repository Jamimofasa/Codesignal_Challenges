import java.sql.Struct;
import java.util.*;

public class ClosestOriginPoint {

        public static int[][] kClosest(int[][] points, int k) {

        int [][] newPoint = new int[k][2];
        double [] distance = new double[points.length];
        double maxValue =0;
        int j =0;
        for (int i = 0; i < points.length;i++)
        {
            int x = points[i][0];
            int y = points[i][1];
            distance[i] =Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        }

        Arrays.sort(distance);

        maxValue = distance[k-1];

            for (int i = 0; i < points.length;i++)
            {

                    int x = points[i][0];
                    int y = points[i][1];


                    if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= maxValue) {

                        newPoint[j][0] = x;
                        newPoint[j][1] = y;

                        j++;
                    }
                    if (j >k)
                        break;

            }
            return newPoint;
        }

    public static void main(String[] args) {
        int [][] points ={{1,3},{2,2}};

        int[][] k = kClosest(points,1);

        for(int[] s : k){
            System.out.println(Arrays.toString(s));
        }

    }
}
