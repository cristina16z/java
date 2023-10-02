import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {

        Scanner join = new Scanner(System.in);
        int num = join.nextInt();
        
        if  (num%2 ==0) {
            System.out.println ("true");
            }else {
            System.out.println ("false");
          }
    }
}