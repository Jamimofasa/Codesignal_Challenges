import java.util.*;

public class maxTruck  {
    public static void main(String[] args) {
       int [][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;

        int load =0;
     Arrays.sort(boxTypes, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
             Integer numOfKeys1 = o1[1];
             Integer numOfKeys2 = o2[1];
             return numOfKeys2.compareTo(numOfKeys1);
         }
     });

//  for(int i =0; i < boxTypes.length-1;i++)
//  {
//      for (int j=i+1;j<boxTypes.length;j++)
//      if (boxTypes[i][1] < boxTypes[j][1])
//      {
//          int [] temp = boxTypes[i];
//          boxTypes[i] = boxTypes[j];
//          boxTypes[j]= temp;
//      }
//  }
        for (int[] x: boxTypes)
            System.out.println(x[1]);

  for(int[] box : boxTypes) {
      if (!(truckSize < box[0]) && truckSize != 0)
      {
          load += box[0]* box[1];
          truckSize -= box[0];
      }
      else
      {
          load += truckSize * box[1];
          break;
      }
      
  }
        System.out.println(load);


//    public static int maximumUnits(int[][] boxTypes, int truckSize) {
//
//    }
}


}
