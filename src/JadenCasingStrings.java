public class JadenCasingStrings {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        String [] words = phrase.split(" ");

        String newPhrase ="";

        for (int i = 0; i < words.length; i++ ) {
            words[i] = words[i].toUpperCase().charAt(0) + words[i].substring(1);
            newPhrase += (i == 0)?words[i]:" "+words[i];
        }

        return newPhrase;
    }

    public static void main(String[] args) {
        String f = "hello my name is";
        System.out.println(toJadenCase(f));
    }
}
