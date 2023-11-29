import java.util.*;

public class matrices {
    static void add(int[][] arr1,int[][] arr2,int[][] result,int m1,int n1,int m2, int n2){
        if(m1 == m2 && n1 == n2){
            for(int i = 0 ; i < m1 ; i++){
                for(int j = 0 ; j < n1 ; j++){
                    result[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        else{
            System.out.println("Additionn not allowed");
        }
    }

    static int[][] mul(int[][] arr1,int[][] arr2,int m1,int n1,int m2, int n2){
        if(n1 == m2){
            int row = 0,col = 0;                 
            int[][] result = new int[m1][n2];
            while(row <= m1 || col <= n2){

                for(int i = 0 ; i < m1 ; i ++){
                    for(int j = 0 ; j < n1 ; j++){
                        result[row][col]
                    }
    
                }
            }
        }
    }
}
