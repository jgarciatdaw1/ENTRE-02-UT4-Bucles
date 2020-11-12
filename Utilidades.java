import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Jon García
 */
public class Utilidades{
    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n){
        int numeroPartido = 0;
        while(n != 0){
            numeroPartido = n % 10;
            if(numeroPartido > 0 && numeroPartido <= 7){
              return true;
            }
            else{
                n = 0;
            }
        }
        return false;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n){
        int contador = 0;
        while(n != 0){
            n = (n / 10);
            contador++;
        }
        return contador;
    }
}
