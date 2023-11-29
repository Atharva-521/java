import java.util.*;

class Bmi{
    String first;
    String second;
    int weight;
    int height;

    Bmi(String first,String second,int weight,int height){
        this.first = first;
        this.second = second;
        this.weight = weight;
        this.height = height;
    }

    public float bmi(){
        float bmiv = (float)weight/(float) (height*height);
        return bmiv;
    }

    public static void main(String[] args){
        Bmi p1 = new Bmi(args[0],args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]));
        System.out.println("Bmi is : "+p1.bmi());
    }
}