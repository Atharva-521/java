//slip 2 que2

import java.util.*;

public class CricketPlayer {
    String name;
    int innings;
    int notout;
    int totalruns;
    int avg;

    int avg(){
        int bavg = totalruns/innings;
        return bavg;
    }

    static void swap(int i,int j,CricketPlayer[] arr){
        CricketPlayer temp = new CricketPlayer(arr[i].name, arr[i].innings, arr[i].notout, arr[i].totalruns);
        arr[i] = arr[j];
        arr[j] = temp;
    }
    CricketPlayer(String name,int innings,int notout,int totalruns){
        this.name = name;
        this.innings = innings;
        this.notout = notout;
        this.totalruns = totalruns;
        this.avg = avg();
    }

    public void display(){
        System.out.println(name);
        System.out.println(innings);
        System.out.println(notout);
        System.out.println(totalruns);
        System.out.println(avg);
        System.out.println();
    }


    public static void main(String[] args){
        CricketPlayer[] arr = new CricketPlayer[3];
        arr[0] = new CricketPlayer("Harshada", 15, 3, 400);
        arr[1] = new CricketPlayer("Atharva", 16, 3, 350);
        arr[2] = new CricketPlayer("Harshuathu", 3, 2, 600);

        for(int i = 0 ; i < 2 ; i++){
            for(int j = i + 1; j < 3 ; j++){
                if(arr[i].avg > arr[j].avg){
                    swap(i,j,arr);
                }
            }
        }

        for(int i = 0 ; i < 3 ; i++){
            arr[i].display();
        }
    }
}


