import java.util.Scanner;

public class Passedstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: C243034");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int total = x * y;
        System.out.println(z > total / 2.0 ? "Yes" : "No");
    }
    
}
