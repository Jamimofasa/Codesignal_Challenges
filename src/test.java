import java.math.RoundingMode;
import java.util.*;
public class test {
    public static void main(String[] args) {
//        int n =2256;
//        while (n >= 10)
//        {
//            System.out.println(n%10);
//           n= n/10;
//        }

//        System.out.println( phoneCall(3,1,2,2));
       int [] a = {419,83,408};


        System.out.println(6249%419);
//        System.out.println( coinChange(a,   6249));

//        int [] ss= {25, 2, 3, 57, 38, 41};
//        mostFrequentDigits(ss);
//        int [] t = mostFrequentDigits(ss);
//        for (int y : t)
//            System.out.println(y);


    }

    public int removeElement(int[] nums, int val) {
     Stack<Integer> stack = new Stack<>();

        Stack<Integer> s = new Stack();
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i] != val)
                s.push(i);
        }
        for(int i =0; i < nums.length; i++)
        {
            if(s.isEmpty())
            {break;}
            nums[i]=s.pop() ;
        }
        return 0;
    }
//    public static int coinChange(int[] coins, int amount) {
//        Arrays.sort(coins);
//        int [] cointAmount = new int[]
//        int coinTotal =0;
//        for(int i =coins.length-1; i> -1; i--)
//        {
//            coinTotal += amount/coins[i];
//            amount -= (amount/coins[i])*coins[i];
//
//        }
//        return (amount > 0)? -1 : coinTotal;
//    }
//
//    static int phoneCall(int min1, int min2_10, int min11, int s) {
//    if( s>(9* min2_10 + min1))
//        return 1+9+ ((s-(9* min2_10 + min1))/min11);
//    if( s>( min1))
//        return 1+ ((s- min1)/min2_10);
//    return s/min1;
//    }

    static void lateRide(int n) {

        int hours = n/60;
        int minuets = n-(hours *60);
        int total=0;



        while(hours >10 || minuets >10)
        {
            total += hours%10 + minuets%10;
            hours = hours/10 ;
            minuets =minuets/10;
        }
       System.out.println(total+minuets+hours);

    }

    public static int[] mostFrequentDigits(int[] a) {


        HashMap<Integer,Integer> freq = new HashMap<>();
        int temp =0;
        int largestNumber =0;
        int count =0;
        for(int i : a)
        {

            do{

                if(i > 10)
                {
                    temp = i%10;
                }
                else
                    temp =i;


                //add to hashmap
                if(!freq.containsKey(temp))
                {
                    freq.put(temp,0);
                }
                else
                    freq.put(temp,freq.get(temp)+1);

                i = i/10;

            }while(i > 0);

        }
//find the largest freq
        for(Map.Entry<Integer,Integer> map : freq.entrySet())
        {
            if(map.getValue()> largestNumber  )
                largestNumber = map.getValue();
        }
        for(Map.Entry<Integer,Integer> map : freq.entrySet())
        {
            if(map.getValue()== largestNumber  )
                count++;
        }
        ;

        int [] most = new int[count];
        count =0;
        for(Map.Entry<Integer,Integer> map : freq.entrySet())
        {
            if(map.getValue()== largestNumber  ) {
                most[count] = map.getKey();
                count++;
            }
        }

        return most;
    }
}
