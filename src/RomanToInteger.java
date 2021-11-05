import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV" ));

    }
     public static int romanToInt(String s) {

        int[] nums =new int[s.length()];
        int index =0;
        int num=0;
         HashMap<Character,Integer> map = new HashMap<>();
         map.put('M',1000);
         map.put('D',500);
         map.put('C',100);
         map.put('L',50);
         map.put('X',10);
         map.put('V',5);
         map.put('I',1);

         for (char c: s.toCharArray())
         {
             nums[index++] = map.get(c);

         }

         for(int i =0 ; i < nums.length;i++)
         {
            num += (i < nums.length-1)? (nums[i+1] > nums[i])? nums[i+1] - nums[i++] : nums[i] : nums[i];

         }
        return num;
    }
}
