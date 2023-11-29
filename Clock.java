import java.util.*;

public class Clock {
        int hrs;
        int min;
        int sec;

        public void isValid(){
            if(hrs <= 24 && min <= 59 && sec <= 59){
                System.out.println("Time is valid");
                System.out.println();
            }
            else{
                hrs = 0;
                min = 0;
                sec = 0;
                System.out.println("Invalid time");
            }
        }

        public void display(){
            if(hrs > 12){
                System.out.println("Time : "+(this.hrs-12)+" : "+min+" : "+sec+" PM");
            }
            else{
                System.out.println("Time : "+(this.hrs-12)+" : "+min+" : "+sec+" AM");
            }
        }

        Clock(int hrs,int min,int sec){
            this.hrs = hrs;
            this.min = min;
            this.sec = sec;
            isValid();
            display();
        }

        public static void main(String[] args){
            Clock time = new Clock(17,49,59);

        }
}
