import java.util.*;
public class Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to capitalize: ");
        String word = sc.nextLine();

        if(word == null || word.isEmpty()){
            System.out.println("Input cannot be empty.");
            sc.close();
            return;
        }

        String capitalizedword = word.substring(0,1).toUpperCase() + word.substring(1);
        System.out.println("The capitalized word is: " + capitalizedword);
        sc.close();
        System.out.println("ID is C243034");
    }
}