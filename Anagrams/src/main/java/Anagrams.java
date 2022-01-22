
public class Anagrams {

    public static void main(String[] args) {

    }

    public static int anagrams(String a, String b){
        int notMatch = 0;

        for (int k = 0; k < a.length(); k++) {
            String ch = Character.toString(a.charAt(k));
            if (b.contains(ch)) {
                b = b.replaceFirst(ch, "");
            } else {
                    notMatch++;
            }
        }

        return notMatch + b.length();

    }
}