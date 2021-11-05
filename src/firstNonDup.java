import java.util.*;

public class firstNonDup {
    public static void main(String[] args) {
        String s = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        System.out.println(firstNotRepeatingCharacter(s));

    }
    public static char firstNotRepeatingCharacter(String s) {
     for(char c : s.toCharArray())
     {
         if(s.indexOf(c) == s.lastIndexOf(c))
             return c;
     }
        return '_';
    }
}
