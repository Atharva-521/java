import java.util.*;

    abstract class Staff{
        protected int id;
        protected String name;

        Staff(int id,String name){
            this.id = id;
            this.name = name;
        }
    }


 class OfficeStaff extends Staff{
        String dept;

        OfficeStaff(int id,String name,String dept){
            super(id,name);
            this.dept = dept;
        }

        public void display(){
            System.out.println(id);
            System.out.println(name);
        }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of data : ");
            int n = sc.nextInt();
            OfficeStaff[] arr = new OfficeStaff[n];
            for(int i = 0 ; i < n ; i++){
                System.out.println("Enter the id : ");
                int id = sc.nextInt();
                System.out.println("Enter the name : ");
                String name = sc.next();
                System.out.println("Enter dept : ");
                String dept = sc.next();
                arr[i] = new OfficeStaff(id, name, dept);
   
            }

            for(int i = 0 ; i < n ; i++){
                arr[i].display();
            }

        }
    }

