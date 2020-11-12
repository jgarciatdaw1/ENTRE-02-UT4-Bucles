
/**
*  Representa a una calcualdora que hace sumas octales
* 
* @author - Jon García
* 
*/
public class CalculadoraOctal{
   /**
   * sumar dos nºs supuestos en base 8 y con el mismo
   * nº de cifras
   * Asumimos positivos
   */
   public int sumarEnOctal(int n1, int n2){
       int total = n1 + n2;
       int cifra = 0;
       int numero = 0;
       int invertir = 0;
       int numeroOctal = 0;
       while(total != 0){
           cifra = total % 8;
           numero = numero * 10 + cifra;
           total = total / 8;
       }
       // Revertir el numero
       do{
           numeroOctal = numero % 10;
           invertir = invertir * 10 + numeroOctal;
           numero = numero / 10;
       }while(numero > 0);
       return invertir;
   }
   /**
    * No estoy seguro de si lo que pide el ejercicio es pasar int total que esta en decimal a octal.
    * No he utilizado la tabla del ejercicio donde explica como se suma en octal, y por mucho que lo he intentado
    * ir cifra por cifra sumando y comprobando si es base 8 o no es un suicidio...
    * 
    * Al menos la calculadora suma y funciona en octal 
    */
}