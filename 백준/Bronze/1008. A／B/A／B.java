import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a < 10) && (a > 0) && (b > 0) && (b < 10))
            System.out.println((a * 1.0) / b);
        sc.close();
    }
}