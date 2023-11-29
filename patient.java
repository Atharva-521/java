//slip3q2

public class patient extends Exception {
    String name;
    int age;
    int oxy;
    int hrct;

    public void display(){
        if(oxy < 95 && hrct > 10){
            try{
                throw new NullPointerException("\n");
            }
            catch(Exception e){
                System.out.println("Patient "+name+" is covid posistive and needs to be hospitalised");
            }
        }
        else{
            System.out.println(name);
            System.out.println(age);
            System.out.println(oxy);
            System.out.println(hrct);
            System.out.println();
        }

    }

    patient(String name,int age,int oxy,int hrct){
        this.name= name;
        this.age = age;
        this.oxy = oxy;
        this.hrct = hrct;
    }

    public static void main(String[] args){
        patient[] arr = new patient[3];

        arr[0] = new patient("Atharva", 21, 91, 11);
        arr[1] = new patient("Harsahda", 19, 99, 5);
        arr[2] = new patient("Patient",30,89,15);

        for(int i = 0 ; i < 3 ; i++){
            arr[i].display();
        }
    }
}
