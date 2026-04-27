import java.util.Scanner;
public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: C243034");
        String[] words = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 10)
                sb.append(w.charAt(0)).append(w.length() - 2).append(w.charAt(w.length() - 1));
            else
                sb.append(w);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}