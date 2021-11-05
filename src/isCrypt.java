import java.util.HashMap;

public class isCrypt {
    public static void main(String[] args) {
      String [] crypt= {"TEN","TWO","ONE"};
    char [][]  solution= {{'O','1'}, {'T','0'}, {'W','9'}, {'E','5'}, {'N','4'}};
        System.out.println(isCryptSolution(crypt,solution));
    }
  static   boolean isCryptSolution(String[] crypt, char[][] solution) {

        HashMap<Character,Character> map = new HashMap<>();
        String [] digits = new String[3];

//hashtable for solution
        for(char [] c : solution)
        {
            map.put(c[0], c[1]);

        }

//convert string into digit
//check leading 0
        for(int i = 0; i < crypt.length; i++)
        {
            digits[i] ="";
            for(char c : crypt[i].toCharArray())
            {
                digits[i] += map.get(c);


            }
            if(digits[i].indexOf("0")== 0 )
            {
                return false;
            }


        }

        return Long.parseLong(digits[0]) + Long.parseLong(digits[1]) == Long.parseLong(digits[2]);


    }
}
