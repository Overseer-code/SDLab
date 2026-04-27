import java.util.*;
public class OddOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first digit(a): ");
        int a = scanner.nextInt();
        System.out.println("Enter the second digit(b): ");
        int b = scanner.nextInt();
        System.out.println("Enter the third digit(c): ");
        int c = scanner.nextInt();
        int OddOne;
        if(a == b){
            OddOne = c;
        } else if (a == c){
            OddOne = b;
        } else {
            OddOne = a;
        }
        System.out.println("The odd one is:" + OddOne);
        scanner.close();
        System.out.println("ID is C243034");
    }
    
}
