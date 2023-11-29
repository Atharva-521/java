import java.util.*;

abstract class order{
    int id;
    String description;

    public abstract void accept();
    public abstract void display();

    order(int id,String description){
        this.id = id;
        this.description = description;
    }
}

class PurchaseOrder extends order{
    String cname;

    PurchaseOrder(int id,String description,String cname){
        super(id,description);
        this.cname = cname;
    }
    public void accept(){
        System.out.println("Order accepted");
    }
    public void display(){
        System.out.println("id : "+id);
        System.out.println("Description : "+description);
        System.out.println("customer : "+cname);
    }
}

class SalesOrder extends order{
    String vname;

    SalesOrder(int id,String description,String vname){
        super(id,description);
        this.vname = vname;
    }

    public void accept(){
        System.out.println("Sales order accepted");
    }

    public void display(){
        System.out.println("id : "+id);
        System.out.println("Description : "+description);
        System.out.println("vendor : "+vname);
    }

}
 
public class orders {
    public static void main(String[] args){
        PurchaseOrder o1 = new PurchaseOrder(1, "soap", "atharva");
        PurchaseOrder o2 = new PurchaseOrder(2, "Moisturizer", "Harshada");
        PurchaseOrder o3 = new PurchaseOrder(3, "Everything", "both");

        SalesOrder o4 = new SalesOrder(4, "stock", "isa");
        SalesOrder o5 = new SalesOrder(5, "item", "rakesh");
        SalesOrder o6 = new SalesOrder(6, "hava", "rava");

        o1.accept();
        o1.display();

        o2.accept();
        o2.display();

        o3.accept();
        o3.display();

        o4.accept();
        o4.display();

        o5.accept();
        o5.display();

        o6.accept();
        o6.display();
    }
}
