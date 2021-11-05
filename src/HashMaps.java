import java.util.HashMap;

public class HashMaps {

    //ransom note in magazine
    public static void main(String[] args) {

        HashMap<Character,Integer> map = new HashMap<>();
      String one ="all the bags in this house that I dont want anyone knowing about";
      String two ="kill";

      for (char c : two.toLowerCase().toCharArray())
      {

          if (!map.containsKey(c))
          {

              map.put(c,1);
          }else {

              map.put(c, map.get(c)+1);
          }
      }

        for (char c : one.toLowerCase().toCharArray())
        {

            if (map.containsKey(c))
            {
                map.put(c, map.get(c)-1);
                if (map.get(c) == 0)
                {
                    map.remove(c);
                }
            }
        }

        if (map.isEmpty())
        {
            System.out.print("is in");
        }else
            System.out.println("not");




    }
}
