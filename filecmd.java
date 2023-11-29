import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class filecmd {
    public static void main(String[] args){
        String filename = args[0];
        File myfile = new File(filename);
        try{
            Scanner sc = new Scanner(myfile);
            int words = 0,line = 0;
            while(sc.hasNextLine()){
                line++;
                String data = sc.nextLine();
                String[] arr = data.split(" ");
                words = words + arr.length;
            }
            System.out.println(line);
            System.out.println(words);
        }
        catch(FileNotFoundException e){
            System.out.println("Error occured");
        }

    }
}
