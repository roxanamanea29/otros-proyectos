/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class arr_bidimencioonal {
      public static void main(String[] args) {
        int [][]matrix = new int[4][5];
        matrix[0][0]=15;
        matrix[0][1]=21;
        matrix[0][2]=18;
        matrix[0][3]=16;
        matrix[0][4]=34;   
        
        matrix[1][0]=10;
        matrix[1][1]=53;
        matrix[1][2]=78;
        matrix[1][3]=1;
        matrix[1][4]=3; 
        
        matrix[2][0]=35;
        matrix[2][1]=29;
        matrix[2][2]=78;
        matrix[2][3]=19;
        matrix[2][4]=84;
        
        matrix[3][0]=65;
        matrix[3][1]=41;
        matrix[3][2]=98;
        matrix[3][3]=76;
        matrix[3][4]=14; 
        
        
        for(int i =0; i<4; i++){
            System.out.println();
          for(int j=0;j<5;j++){
              System.out.print(matrix[i][j]+ " ");
          }
        }  
    } 
}
