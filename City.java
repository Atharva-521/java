import java.util.*;

class Country {
    String cntname;
    Country(String cntname){
        this.cntname = cntname;
    }
}

class State extends Country{
    String sname;

    State(String cntname,String sname){
        super(cntname);
        this.sname = sname;
    }
}

class City extends State{
    String cname;
    City(String cntname,String sname,String cname){
        super(cntname,sname);
        this.cname = cname;
    }

    public void display(){
        System.out.println(cntname);
        System.out.println(sname);
        System.out.println(cname);
    }

    public static void main(String[] args){
        City obj = new City("India", "Maharashtra", "Pune");
        obj.display();
    }
}
