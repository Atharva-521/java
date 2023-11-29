package student;

public class studentInfo {
    int roll;
    int classs;
    int marks;

    studentInfo(int roll,int classs,int marks){
        this.roll = roll;
        this.classs = classs;
        this.marks = marks;
    }

}

public class StudentPer extends studentInfo{
    float percentage;

    StudentPer(int roll,int classs,int marks){
        super(roll,classs,marks);
        percentage = ((float) marks/100)*100;
    }

    public void display(){
        System.out.println(roll);
        System.out.println(classs);
        System.out.println(marks);
        System.out.println(percentage);
        System.out.println();
    }
}
