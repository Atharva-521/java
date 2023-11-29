import java.util.*;
public class zero extends Exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number : ");
            int n = sc.nextInt();
            if(n == 0){
                throw new zero();
            }
            else{
                System.out.println("Prime");
            }
        }
        catch(zero e){
            System.out.println("Zero error");
        }

        
    }
}
