/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        int arreglos[], nelementos,aux;
        // se utiliza un ventana emergente para pedir los datos
        nelementos=Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos de arreglos:"));
        arreglos=new int[nelementos];// asiganmos el numero de elementos ar arreglos
        // se declara un bucle for para pedir todos los elmentos que contendra el arreglo
        for(int i=0;i<nelementos;i++){
            System.out.print((i+1)+"  digite un numero:  ");// se pide que el numero empiece desde 1
        arreglos[i]=entrada.nextInt();// se guarda los datos que contiene nuestro arreglo
        
    }
        //metodo burbuja
        for(int i=0;i<(nelementos-1);i++){// se utiliza el primer for para indicarle al programa cuantas vueltas tinene que realizar
            for(int j=0;j<(nelementos-1);j++){//se utilizza el siguiente for para ordenar los  numeros por el metodo burbuja
                if(arreglos[j]>arreglos[j+1]){// si numero actual es mayor al siguiente
                    aux=arreglos[j];// si aux es igual al numero actual
                    arreglos[j]=arreglos[j+1];// al numero actual le agragamos el numero siguiente
                    arreglos[j+1]=aux;// el numero actual va ser igual al numero siguiente 
                } 
                
            }
         }
        //mostrando el numero de elementos del arreglos
         System.out.println("\narreglo ordenado de forma creciente: ");
        for(int i=0;i<nelementos;i++){
            System.out.print(arreglos[i]+" -");// se imprime el arreglo con el iterador
        }
        System.out.println("\n arreglo ordenado de forma decreciente: ");
        for(int i=(nelementos-1);i>=0;i--){
            System.out.print(arreglos[i]+" -");
        }
        System.out.println("");
    }
}
