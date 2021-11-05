public class Practice {
    public static void main(String[] args) {
        String string ="Put this is reverse";
        String reverse = reverseString(string);
        String loop = reverseLoop(string);
        System.out.println(loop);

    }
//print string in reverse using recursion
    public static String reverseString(String string){
        if (string.length() == 1)
            return string;
        else
            return string.charAt(string.length()-1)+reverseString(string.substring(0,string.length()-1)) ;

    }
    //print string in reverse using loop
    public static String reverseLoop(String string){
        String temp ="";
        for (int i = string.length()-1; i >= 0; i--){
            temp += string.charAt(i);
        }
        return temp;
    }
}
