import java.util.Scanner;
public class Capitalizefirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: C243034");
        String s = sc.next();
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}