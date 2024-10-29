package combinatorics;
// baekjoon 1010
import java.util.Scanner;
import java.util.Arrays;
public class BuildBridges {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[][] data = new int[T][];
        long[] result = new long[T];
        s.nextLine();
        for (int i = 0; i < T; i++) {
            data[i] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < T; i++) {
            int N = data[i][0];
            int M = data[i][1];
            result[i] = combination(M, N);
        }
        Arrays.stream(result).forEach(System.out::println);
        s.close();
    }

    public static long combination(int n, int r) {
        long result = 1;
        for (long i = 1; i <= r; i++) {
            result *= (n - r + i);
            result /= i;
        }
        return result;
    }
}
