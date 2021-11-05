import java.util.HashMap;

public class Codeility {
    public static String solution(String line1, String line2) {
        // write your code in Java
        String line ="";
        HashMap<Character,Integer> map = new HashMap();
        map.put('P',1);
        map.put('G',2);
        map.put('B',3);


            if (line1.length() ==0)
              return  line+= line2;
            if (line2.length() ==0)
                return  line+= line1;
            if (Integer.compare(map.get(line1.charAt(0)),map.get(line2.charAt(0))) <1)
            {
               return line += line1.charAt(0) + solution(line1.substring(1), line2);
            }
            if (Integer.compare(map.get(line1.charAt(0)),map.get(line2.charAt(0))) == 1 )
            {
               return line += line2.charAt(0) + solution(line1,line2.substring(1));
            }

        return line;

    }

    public static void main(String[] args) {

        String l1 = "GPBGBBGPBGPBGBGPBGPGG";
        String l2 = "GPGGGBPBPPGPGPPPGGBBGBPG";
        System.out.println(solution(l1,l2));

    }
}
