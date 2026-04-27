import java.util.Scanner;
public class Actemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: C243034");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int minTemp = Math.max(a, c);
        System.out.println(minTemp <= b ? "Yes" : "No");
    }
}