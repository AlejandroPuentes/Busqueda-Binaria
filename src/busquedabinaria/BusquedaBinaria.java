/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import static java.awt.PageAttributes.MediaType.A;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author User
 */

public class BusquedaBinaria extends Frame{
   private int conta=0;

   
    
    

    public int Bi_recursiva(int A[], int NuB,int j,int i){
        int mitad = (i+j)/2;
        conta=conta+3;
        int X=A[mitad];
        conta=conta+2;
        conta=conta+1;
        if (NuB==X){
            conta=conta+1;
            return mitad;
        }
        conta=conta+1;
        if (i>j){
            conta=conta+1;
            return -1;
        }
        conta= conta+1; 
        if(X<NuB){
            conta=conta+2;
            return Bi_recursiva(A,NuB,j,mitad+1);
        }else{
            conta=conta+2;
            return Bi_recursiva(A,NuB,mitad-1,i);
        }
    }
    
    public int contador (){
        return conta;
    }
     public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
      Pintar pin = new Pintar();
      pin.show();
        
        
    }
    
}
