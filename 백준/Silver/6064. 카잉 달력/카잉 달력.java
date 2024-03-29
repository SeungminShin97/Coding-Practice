import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int y1 = (n == y) ? y : 0;
            int m1 = 0;
            int lcm = m * n / ((m > n) ? GCD(m, n) : GCD(n, m));
            while(m1 <= lcm) {
                if((m1 + x) % n == y - y1) {
                    sb.append(m1 + x + "\n");
                    break;
                }   
                else 
                    m1 += m;
            }
            if(m1 > lcm)
                sb.append("-1\n");
        }
        System.out.println(sb);
    }

    public static int GCD(int a, int b) {
        int c;
        while(b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}