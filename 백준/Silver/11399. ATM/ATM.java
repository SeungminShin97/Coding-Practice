import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) 
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int total = 0;
        for(int i = 0 ; i < n; i++) {
            total += arr[i] * (n - i);
        }
        System.out.println(total);
    }
}
