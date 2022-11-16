package codechallenges.checagemdepalindromo;

public class Main {
    public static void main(String[] args) {
        String word = "tenet";

        System.out.println(isPalindrome(word));
    }
    public static String isPalindrome (String word) {
        StringBuilder sb = new StringBuilder(word);
        if (word.equals(sb.reverse().toString())) return "TRUE";
        return "FALSE";
    }
}
