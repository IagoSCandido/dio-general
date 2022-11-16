package codechallenges.fatorialdesajeitado;

// Understand and improve algorithm
public class Main {
    public static void main(String[] args) {
        int number = 10;

        System.out.println(fatorialDesajeitado(number));
    }

    public static int fatorialDesajeitado(int number) {
        int result = 0, temp = number, count = 1;
        number--;

        while (number > 0) {
            temp *= number;
            number--;
            if (number != 0) {
                temp /= number;
                number--;
            }
            temp += number;
            number--;
            result += temp;
            temp = -number;
            if (number == 1) result += temp;
            number--;
        }
        return result;
    }

}

