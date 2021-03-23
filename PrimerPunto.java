package com.mycompany.tallerrecursivo;

import java.util.Scanner;
//jhonatan vanegas
//19/03/2021
public class PrimerPunto {

    static float resultado;
    static float resultado1;
    static int n;
    static int count = 1;
    static int numero;
    static boolean salir = false;
    static String op;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese una de las opciones \n"
                + "1. para hacer la forma iterativa\n"
                + "2. para hacer la forma recursiva\n"
                + "3. para salr del programa");
        op = leer.next();

        do {
            switch (op) {
                case "1": {

                    System.out.println("Ingrese un numero positivo entero");
                    n = leer.nextInt();
                    InterativeWay(n);
                    break;
                }

                case "2": {
                    System.out.println("Ingrese un numero entero positivo");
                    n = leer.nextInt();
                    RecusiveWay(n);
                    System.out.println("El resultado es: " + resultado);

                    break;
                }
                case "3": {
                    salir = true;
                    break;
                }
                default:
                    System.out.println("Solo se permite 1 de las 3 opciones");
                    break;
            }

        } while (salir == true);

    }

    public static void InterativeWay(int n) {

        for (int i = 1; i <= n; i++) {
            resultado += (1 / (float) i);
        }
        System.out.println("El resultado es: " + resultado);
    }

    public static void RecusiveWay(int n) {

        resultado += (1 / (float) count);
        count += 1;
          
        if (count <= n) {
            RecusiveWay(n);
        }
   
    }

}
