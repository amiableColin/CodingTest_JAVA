package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
public class integer_triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(s.readLine());
        int triangle[][] = new int[N][];
        triangle[0] = new int[1];
        triangle[0][0] = Integer.parseInt(s.readLine());

        for (int i = 1; i < triangle.length; i++) {
            triangle[i] = Stream.of(s.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        s.close();
    }
}