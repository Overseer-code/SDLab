import java.util.Scanner;
public class Declamation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: C243034");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), x = sc.nextInt();
        System.out.println(x == a || x == b || x == c ? "Yes" : "No");
    }
}