import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;

public class CodilityPractice {

    public static int divisibleByK(int a, int b, int k)
    {
        return ((b-a)>k)?(a%k ==0)? (b-a)/k+1: (b-(a-a%k))/k+1:0;
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int min = 1;

        // Starting from 1 (min), compare all elements, if it does not match
        // that would the missing number.
        for (int i : A) {
            if (i == min) {
                min++;
            }
        }

        return min;
    }
    public static void main(String[] args) {
//        System.out.println(divisibleByK(6,11,2));
        int[]k = {1,2,3};


        System.out.println(solution(k));

    }

}
