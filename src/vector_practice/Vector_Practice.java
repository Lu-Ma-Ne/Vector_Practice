/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector_practice;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Vector_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tamanho= 3;
         String[] name = new String [tamanho];
         int[]age = new int [tamanho];
         double[] salary = new double[tamanho];
         String[] color = new String [tamanho];
         var kb = new Scanner (System.in);
         
       int i;
       for (i=0; i<tamanho; i++)
       {
           System.out.println("Please, type your name");
           //kb.nextLine();
           name[i] = kb.nextLine();
           System.out.println("Please, type your age");
           age[i] = kb.nextInt();
           System.out.println("Please, type your salary");
           salary[i] = kb.nextDouble();
           System.out.println("Please, type your favorite color");
           kb.nextLine();
           color[i] = kb.nextLine();
       }
       for (i=0; i<tamanho; i++)
       {
        System.out.println(name[i]+" "+ age[i]+" "+ salary[i]+" "+ color[i]+" ");
       }
    }
 }

      
    
    

