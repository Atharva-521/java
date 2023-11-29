import java.io.*;
import java.util.Scanner;
public class copycontent extends Exception {
    
    public static void copy(String a, String b){
        try{
            int n;
            FileInputStream fis = new FileInputStream(a);
            FileOutputStream fos = new FileOutputStream(b);
            while((n = fis.read()) != -1){
                fos.write(n);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
       

    }

    public static void main(String[] args){
        copy("hello.txt","bye.txt");
    }
}
