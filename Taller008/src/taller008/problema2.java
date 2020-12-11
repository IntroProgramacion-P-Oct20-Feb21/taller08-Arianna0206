/*
 * Realizar un proceso repetitivo que itere desde el número 1 al 26.
 * Usando la tabla ASCII genere la siguiente visualización. Use el ciclo for
 * Debe generar la siguiente salida:
 * a
 * bb
 * ccc
 * dddd
 * eeeee
 * ffffff
 * ggggggg
 * hhhhhhhh
 * iiiiiiiii
 * jjjjjjjjjj
 * kkkkkkkkkkk
 * llllllllllll
 * mmmmmmmmmmmmm
 * nnnnnnnnnnnnnn
 * ooooooooooooooo
 * pppppppppppppppp
 * qqqqqqqqqqqqqqqqq
 * rrrrrrrrrrrrrrrrrr
 * sssssssssssssssssss
 * tttttttttttttttttttt
 * uuuuuuuuuuuuuuuuuuuuu
 * vvvvvvvvvvvvvvvvvvvvvv
 * wwwwwwwwwwwwwwwwwwwwwww
 * xxxxxxxxxxxxxxxxxxxxxxxx
 * yyyyyyyyyyyyyyyyyyyyyyyyy
 * zzzzzzzzzzzzzzzzzzzzzzzzzz
 */
package taller008;

/**
 *
 * @author macbookair
 */
public class problema2 {
    public static void main(String[] args) {
        char valor;
        
        for (int i = 1; i <= 26; i++){
            for (int contador = 1; contador <= i; contador++) {
            valor = (char)(i + 96);
            System.out.printf("%s", valor);    
        }
            System.out.println("");   
    }   
}
}

