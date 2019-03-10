/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class tarea1 {
      public static void main(String[] args) {
        int mat[][]={{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
      int x=0,y=0,res=0,res1=0,res3=0;
        for(x=0;x<4;x++){
        for(y=0;y<4;y++){
            res=mat[x][y]+mat[x][y+1]+mat[x][y+2];
            res1=res+mat[x+1][y+1];
            res3=res1 +mat[x+2][y]+mat[x+2][y+1]+mat[x+2][y+2];
            System.out.print("!"+res3);
        }
        }
       
        
      
      
      
      
      
     
      
      
      
      }
}
