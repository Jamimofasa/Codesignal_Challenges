import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LogestSubStringNoRepeats {
    public static int lengthOfLongestSubstring(String s) {
        int longestString = 0;
        Set<Character> set =new HashSet<>();

        if (s.length() ==1)
            return 1;
        for (int i = 0; i < s.length()-1;i++)
        {
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length();j++)
        {
            if (!set.add(s.charAt(j)))
            {
                if (set.size() > longestString) {
                    longestString = set.size();
                    set.clear();
                    i =j-1;
                    break;
                }

            }
            else if (set.size() == s.length());
            return set.size();
        }
        }

        return longestString;
    }

    public static void main(String[] args) {
        String s=" ";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
