package PROGRAMMERS_LV2;
import java.util.Arrays;
public class least_common_multiple {
    static int solution(int[] arr) {
        Arrays.sort(arr);
        boolean check = true;
        int comm_multiple = arr[arr.length - 1];
        int max_data = comm_multiple;
        int j = 1;
        while (true) {
            check = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(comm_multiple % arr[i] != 0) {
                    check = false;
                    break;
                }
            }
            if (check) break;
            comm_multiple = max_data * ++j;
        }
        return comm_multiple;
    }
    public static void main(String[] args) {
        int[] arr = {13,11};
        System.out.println(solution(arr));
    }
}