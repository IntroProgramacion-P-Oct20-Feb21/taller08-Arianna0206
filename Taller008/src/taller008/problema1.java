/*
 *Dada una palabra; generar un proceso que permita presentar 
 *la siguiente salida por pantalla. Use el ciclo for
 * Ejemplo: Para la visualización se usa la palabra Universidad: 
 * Debe generar la siguiente salida: 
 * U
 * nn
 * iii
 * vvvv
 * eeeee
 * ssssss
 * iiiiiii
 * dddddddd
 * aaaaaaaaa
 * dddddddddd 
 * 
 */
package taller008;

/**
 *
 * @author macbookair
 */
public class problema1 {

    public static void main(String[] args) {
        String palabra = "Universidad";
        char letra;

        for (int i = 0; i < palabra.length(); i++) {
            for (int contador = 0; contador <= i; contador++) {
                letra = palabra.charAt(i);
                System.out.printf("%s", letra);

            }
        System.out.println("");   
        }
    }
}
