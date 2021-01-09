/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoQuicksort;

/**
 *
 * @author JOSE
 */
public class Mainquicksort {
    public static void main(String[] args) {
        System.out.println("arreglo ordenado por metodo quicksort: ");
       int []arreglo={5,7,3,9,2,8,2,4,1,6,10,13,11,12,24};// se insertan los elementos que contendra el arreglo
       Ordenamiento_por_quicksort a = new Ordenamiento_por_quicksort(); // se declara una variable en donde se retornara los datos
       a.ordenamientopoquicksort(arreglo);// se insertan los datos que contiene el arreglo 
       for(int i=0;i<arreglo.length;i++){// se utiza un ciclo for para mostrar los datos  
           
           System.out.print(" ["+arreglo[ i ]+"]");// se imprime los datos que contiene el arreglo
           
       }
           System.out.println(" ");
        
    }
}
