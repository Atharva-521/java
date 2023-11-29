import java.util.*;

interface marker{

}


public class Product implements marker {
    int id;
    String name;
    int cost;
    int quantity;

    Product(){
        this.id = 0;
        this.name = "";
        this.cost = 0;
        this.quantity = 0;
    }

    Product(int id,String name,int cost,int quantity){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public void display(){
        System.out.println(id); 
        System.out.println(name);
        System.out.println(cost);
        System.out.println(quantity);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects ");
        int n = sc.nextInt();
        Product[] arr = new Product[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter Id : ");
            int id = sc.nextInt();
            System.out.println("Enter Name : ");
            String name = sc.next();
            System.out.println("Enter cost : ");
            int cost = sc.nextInt();
            System.out.println("Enter quantity : ");
            int quantity = sc.nextInt();

            arr[i] = new Product(id, name, cost, quantity);  
        }
        for(int i = 0 ; i < n ; i++){
                arr[i].display();
            }
    }
}
