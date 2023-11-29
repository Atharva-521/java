import java.util.*;
public class Employee {
    int id;
    String name;
    String designation;
    int salary;

    public String toString(){
        return id+" "+name+" "+designation+" "+salary;
    }

    Employee(int id,String name,String designation,int salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public static void main(String[] args){
        Employee obj = new Employee(1, "Harshada", "Boss", 900000);
        System.out.println(obj.toString());
    }
}
