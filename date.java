import java.text.SimpleDateFormat;
import java.util.*;
public class date {
    public static void main(String[] args){

        Date currentDate = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyy");
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd yyyy");
        SimpleDateFormat format4 = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
    
        System.out.println(format1.format(currentDate));
        System.out.println(format2.format(currentDate));
        System.out.println(format3.format(currentDate));
        System.out.println(format4.format(currentDate));
        System.out.println(format5.format(currentDate));
    }
}
