import java.util.Scanner;
public class Integeraverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), c = sc.nextInt();
        System.out.println("ID: C243034");
        System.out.println((a + c) % 2 == 0 ? "Yes, B = " + (a + c) / 2 : "No");
    }
}