import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class palindrone {

    public static   void isPalindrome(String str) {

        String test = "aba";
        test = test.replaceAll(" ","");


        System.out.println(test);
        System.out.println(palindrome(str));
        System.out.println(test);
        System.out.println(breakPalindrome(test));
    }



    public static String breakPalindrome(String palindrome) {

        char[] temp = palindrome.toCharArray();
        int smallestIndex=0;
        if(temp[0]== 97)
            smallestIndex=1;
        int index = smallestIndex;

        for(int i= index; i < palindrome.length()-1; i++)
        {
            if(temp[smallestIndex] >temp[i] && smallestIndex>i)
            {

                smallestIndex = i;
            }
        }

        if(temp[smallestIndex]==97)
            temp[smallestIndex]+=1;
        else
            temp[smallestIndex]-=1;

        String newString = new String(temp);
        return newString ;

    }

    private static String removeWhiteSpaces(String str) {
        String newStr = "";
        //remove spaces
        for (char c : str.toCharArray()) {
            if (c != ' ')
                newStr += c;
        }
        return  newStr;
    }


    //palindrome recursion
    public  static boolean palindrome(String str)
    {

        int start = 0;
        if (start == str.length()/2)
            return true;
        if (str.toLowerCase().charAt(start) == str.toLowerCase().charAt(str.length()-1))
            return palindrome(str.substring(++start,str.length()-1));
        else
            return false;
    }

//    public  static int adjacentElementsProduct(int[] inputArray) {
//        int largestProduct =0;
//        for(int i =0; i < inputArray.length-1; i++)
//        {
//            if(largestProduct < inputArray[i] * inputArray[i+1])
//                largestProduct = inputArray[i] * inputArray[i+1];
//        }
//        System.out.println(largestProduct);
//        return largestProduct;
//
//    }
//   public static boolean almostIncreasingSequence(int[] sequence) {
//
//       int max =sequence[0], count =0;
//
//       boolean isend = false;
//       ArrayList<Integer> list = new ArrayList<Integer>();
//       for (Integer i: sequence)
//           list.add(i);
//while(!isend){
//    if(list.size() <3||  count ==2)
//    {
//        break;
//    }
//       for(int i = 0; i <list.size()-2;i++) {
//           if (i >= list.size()-2)
//               isend = true;
//
//           if (list.get(i) > list.get(i + 1) && list.get(i) > list.get(i + 2)) {
//               System.out.println(list.remove(i));
//               count++;
//               break;
//           }
//           if (list.get(i) > list.get(i + 1) && list.get(i + 1) < list.get(i + 2)) {
//               System.out.println(list.remove(i + 1));
//               list.remove(i + 1);
//               count++;
//               break;
//           }
//           if (list.get(i) < list.get(i + 1) && list.get(i + 1) > list.get(i + 2)) {
//               System.out.println(list.remove(i + 2));
//               ;
//               count++;
//               break;
//           }
//           if (list.get(i) == list.get(i + 1) || list.get(i) == list.get(i + 2) ) {
//               System.out.println(list.remove(i));
//               ;
//               count++;
//               break;
//           }
//           if ( list.get(i+1) == list.get(i + 2) ) {
//               System.out.println(list.remove(i+1));
//               ;
//               count++;
//               break;
//           }
//       }
//       }
//
//       if(count >= 2)
//       {
//           return false;
//       }else
//           return true;
////       int max =sequence[0], count =0;
////
////       for(int i = 1; i < sequence.length; i++)
////       {
////
////           if(max >= sequence[i] )
////           {
////               count++;
////           }
////           if (max < sequence[i])
////       {
////           max = sequence[i];
////       }
////       }
////       if(count >= 2)
////       {
////           return false;
////       }else
////           return true;
//    }
}
