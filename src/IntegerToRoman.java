public class IntegerToRoman {
    public static void main(String[] args) {

        System.out.println(intToRoman(1994));

    }
    public static String intToRoman(int num) {
        String s="";

        String[][] c ={{"1000","M"},
                {"900","DM"},
                {"500","D"},
                {"400","CD"},
                {"100","C"},
                {"90", "XC"},
                {"50", "L"},
                {"40", "XL"},
                {"10", "X"},
                {"9", "IX"},
                {"5", "V"},
                {"4", "IV"},
                {"1", "I"}};


        for (String[] str: c) {

            while ( num >= Integer.parseInt(str[0])) {
                num -= Integer.parseInt(str[0]);
                s += str[1];
                break;
            }
        }

        return s;
    }
}
