public class Main7 {
    public static void main(String[] args) {
        String ID = "C243034";
        for (int i = 1; i <= 6; i++){
            if (i == 3) continue;  // skips 3
            if (i == 6) break;     //stops loop
            System.out.println(i);
        }
        System.out.println("ID is " + ID);
    }
    
}
