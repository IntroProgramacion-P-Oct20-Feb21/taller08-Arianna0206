/*
 * Genere una solución que permite presentar en pantalla la suma 
 * de los elementos de la serie. El usuario ingresa por teclado el valor de n 
 * (siempre que sea un valor positivo)
 * Realizar la siguiente operación:        
 *  i = 1
 *       1/2^i 
 */
package taller008;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class problema3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        int n;
        double suma = 0;
        double numerador = 1;
        double denominador;
        
        
        System.out.println("Ingrese el valor n");
        n = entrada.nextInt();
        if(n>0){
            for (int i = 1; i <= n; i++) {
                denominador = Math.pow(2, i);
                
                suma = suma + (numerador/denominador);  
                     
    }
            System.out.printf("Valor de la sumatoria %.4f\n", suma);
    
}else{
            System.out.printf("Error, el valor es negativo");   
        }
          
}
} 
