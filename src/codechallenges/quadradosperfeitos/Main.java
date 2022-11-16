package codechallenges.quadradosperfeitos;

// TODO: improve algorithm;
public class Main {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(perfectSquares(n));

    }
    public static int perfectSquares(int number) {
        int result, count, countTotal;
        int[] d = new int[number + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= number) d[i] = i * i;
            else i = d.length - 1;
        }
        countTotal = 100;
        for (int i = d.length - 1; i > 0 && i <= number; i--) {
            if (d[i] > 0) {
                result = number;
                count = 0;
                for (int j = i; j > 0; j--) {
                    while (result > 0) {
                        if (result >= d[j]) {
                            result = result - d[j];
                            count++;
                        } else j--;
                    }
                }
                if (countTotal > count) countTotal = count;
            }
        }
        return countTotal;
    }
}
