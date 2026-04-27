import java.util.*;
public class Iiuctv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int SubscriptionsNeeded = (N + 5)/6;
        int totalCost = SubscriptionsNeeded * X;
        System.out.println(totalCost);
        sc.close();
        System.out.println("ID is C243034");
    }
    
}
