
import java.util.Scanner;
public class Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: C243034");
        long p = sc.nextLong(), q = sc.nextLong(), r = sc.nextLong(), s = sc.nextLong();
        long total = p + q + r + s;
        boolean mono = p > total - p || q > total - q || r > total - r || s > total - s;
        System.out.println(mono ? "Yes" : "No");
    }
}