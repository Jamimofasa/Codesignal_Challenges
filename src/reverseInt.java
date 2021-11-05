import java.lang.reflect.Type;
import java.util.*;

public class reverseInt {
    public static void main(String[] args) {
        int x =-1534239;
        int reverseInt=0;
        //make to String

        char[] s= String.valueOf(x).toCharArray();

        for(int i =0; i<s.length/2;i++)
        {
            if (s[0] == '-')
            {
                char temp = s[i+1];
                s[i+1] = s[s.length-i-1];
                s[s.length-i-1] =temp;
            }else {
                char temp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = temp;
            }
        }

        //if bigger than int range return 0;
        if((int)Math.pow(-2,32)*-1 > Long.parseLong(new String(s)) || Long.parseLong(new String(s)) >(int) Math.pow(2,32)-1)
            System.out.println("0");
        else {
             reverseInt = Integer.parseInt(new String(s));
        }

        //print out new number
        System.out.println(reverseInt);

        }

}
