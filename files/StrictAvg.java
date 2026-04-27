import java.util.*;
public class StrictAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers(a,b,c) separated by spaces: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double average = (a+b)/2;
        System.out.println("The average of a & b is: "+ average);
        if(average>c){
            System.out.println("Result: Yes,the average of a & b ("+ average +") is strictly greater than c ("+ c + ").");
        } else {
            System.out.println("Result: No,the average of a & b ("+ average +") is not strictly greater than c ("+ c + ").");

        }
        input.close();
        System.out.println("ID is C243034");
    
    }
}
