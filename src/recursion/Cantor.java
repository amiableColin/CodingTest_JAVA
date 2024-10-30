package recursion;
// beakjoon 4779
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cantor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);
            int size = (int) Math.pow(3, N);
            StringBuilder result = new StringBuilder("-".repeat(size));

            createCantorSet(result, 0, size);

            System.out.println(result);
        }
        br.close();
    }

    private static void createCantorSet(StringBuilder result, int start, int length) {
        if (length == 1) return;
        int third = length / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            result.setCharAt(i, ' ');
        }
        createCantorSet(result, start, third);
        createCantorSet(result, start + 2 * third, third);
    }
}
