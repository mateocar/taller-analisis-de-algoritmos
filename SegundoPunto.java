package com.mycompany.tallerrecursivo;

import java.util.Scanner;
//jhonatan vanegas 
//21/03/2021
public class SegundoPunto {

    static int count = 1;
    static int num = 1;
    static double enl=1.0;
    static double fact=1.0;
    static double  delta=1.0;
    
    static Scanner leer = new Scanner(System.in);
     
    public static void main(String[] args) {

       
        RecusiveWat();
        System.out.println(enl);
    }

  

    static public void RecusiveWat() {
       

        if (enl != enl + delta) {

            enl += delta;

            count += 1;

            fact *= count;

            delta = 1.0 / fact;

            RecusiveWat();

        }

    }

}
