/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2_p2_michaelmartinez;

import java.util.Scanner;

/**
 *
 * @author Michael Martínez
 */
public class Tarea2_P2_MichaelMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        boolean bandera=true;
        int opcionMenu=0;
        while (bandera) {
            System.out.println("1. Binario ");
            System.out.println("2. Sumatoria");
            System.out.println("3. Factorial");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. Salir");
            System.out.print("Ingrese el método a utilizar: ");
            opcionMenu=entrada.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese el número: ");
                    int numero=entrada.nextInt();
                    binario(numero);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Ingrese el número a sumar: ");
                    numero=entrada.nextInt();
                    numero=sumatoria(numero);
                    System.out.println(numero);
                    break;
                case 3:
                    System.out.print("Ingrese el número a calcular el factorial: ");
                    numero=entrada.nextInt();
                    numero= factorial(numero);
                    System.out.println(numero);
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    int contador=0;
                    System.out.print("Ingrese el número a invertir: ");
                    numero=entrada.nextInt();
                    String cadena=numero+"";
                    cadena=numeroInvertido(cadena, contador);
                    System.out.println(cadena);
                    break;
                case 6:
                    bandera=false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public static void  binario(int a){
        int b=2;
        int division=a/b;
        if (a==1|| a==0) {
            System.out.print(a);
        }else{
            binario(division);
            System.out.print(a%b);
        }
        
    }
    
    public static int sumatoria(int a){
        int suma=0;
        if (a==0) {
            suma+=a;
        }else{
            suma=a+sumatoria(a-1);
        }
        return suma;
    }
    
    public static int factorial(int a){
        int contador=1;
        int factorial=0;
        if (a==1) {
            factorial=a;
        }else{
            factorial=a*factorial(a-contador);
        }
        return factorial;
    }
    
    public static String numeroInvertido(String cadena, int contador){
        //int contador=1;
        String nuevaCadena="";
        char carac=' ';
        if (cadena.length()-1==contador) {
            carac=cadena.charAt(contador);
            nuevaCadena+=carac;
        }else{
            carac=cadena.charAt(contador);
            contador++;
            nuevaCadena=numeroInvertido(cadena,contador)+carac;
        }
               
                
       return nuevaCadena; 
    }
}
