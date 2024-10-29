package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;
public class RGB_distance {
    public static void main(String[] args) throws IOException{
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(s.readLine());            // 집 수
        int datas[][] = new int[N][3];  // 빨 초 파

        for (int i = 0; i < datas.length; i++) {
            datas[i] = Stream.of(s.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 1; i < datas.length; i++) {
            datas[i][0] += Math.min(datas[i-1][1], datas[i-1][2]);
            datas[i][1] += Math.min(datas[i-1][0], datas[i-1][2]);
            datas[i][2] += Math.min(datas[i-1][0], datas[i-1][1]);
        }
        System.out.println(Arrays.stream(datas[N-1]).min().getAsInt());
        s.close();
    }
}