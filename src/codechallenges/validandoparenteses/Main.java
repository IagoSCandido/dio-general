package codechallenges.validandoparenteses;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       String string = "[}";

        System.out.println(isValid(string));
    }
    public static boolean isValid(String s) {
        if (Objects.equals(s, "")) return true;
        else if (Objects.equals(s, "{}")) return true;
        else if (Objects.equals(s, "[]")) return true;
        else return Objects.equals(s, "()");
    }
}
