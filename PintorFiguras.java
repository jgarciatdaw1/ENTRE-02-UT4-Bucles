/**
 *  Clase que dibuja una figura 
 * 
 * @author - Jon García
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';
    


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public void dibujarFigura(int altura){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < altura; j++){
                    System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    /**
     * La verdad es que no tengo ni idea de cómo hacer una pirámide y no entiendo el planteamiento que hay detrás de 
     * usar un for para construir figuras
     * 
     */
    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private void escribirEspacios(char caracter, int n){
         
    }
}
