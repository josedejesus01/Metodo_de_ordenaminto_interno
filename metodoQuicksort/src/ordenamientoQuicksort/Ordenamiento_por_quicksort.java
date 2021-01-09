
package ordenamientoQuicksort;

public class Ordenamiento_por_quicksort {
    // se crea un metodo que contiene los datos
    public void ordenamientopoquicksort(int [] array)
    {
        array=quicksort1(array);// se tutliza un array que sea igual al arreglo
    }
    public int [] quicksort1(int numeros[])// se crea el metodo con un parametros
          
    {
    return quicksort2(numeros,0,numeros.length-1);// contien todos los movimientos que se hace en le progrma
    }
    public int [] quicksort2(int numeros[],int izq,int der)// en este metodo se guardara los datos que que se realizara durante la ejecucion del programa
    {
        if (izq>=der)// se hace una comparacion si el numero isquierdo es mayor o igual que el numero derecho
            return numeros;// retorna los numeros
        int i=izq,d=der;// se declaran las variables independiente i,d
        if(izq!=der) // se hace una comparacion si izq es diferentes a la derecha
        {
            // se declara los tipos de variables auxiliares  
        int pivote;
        int aux;
        pivote=izq; // numero izq se almacenan a la variable pivote
        while(izq!=der)// se emplea un bucle while para realizar una comparacion 
        {
            while(numeros[der]>=numeros[pivote] && izq<der)// se compara si el numero derecho es mayor o igual al numero pivote y izq es menor de derecha
                der--;// se decrementa el puntero
            while(numeros[izq]<numeros[pivote] && izq<der)// se compara el numero izquierdo si es mayor o igual numero pivote y izq es menor de izquierda
                izq++;// se incrementa el puntero
            if (der!=izq){
                aux=numeros[der];// se hace un cambio de auxiliar que va hacer el de la dercha
                numeros[der]=numeros[izq];// el numero derecho se inserta al lado del numero izq
                numeros[izq]=aux;// intercambiamos el lado izq al auxiliar
               }
            }
           if(izq==der){// se hace una comparacion si izq es igual al der
            // se vuleve a llamar los numeros pero con punteros diferentes y hasta que se ordenen los numeros 
               quicksort2(numeros,i,izq-1);
               quicksort2(numeros,izq+1,d);
               
           }
         }
        else
            return numeros;
        return numeros;
    }
}