import java.util.Scanner;

/**
 *  @author - Jon García
 *  
 * Punto de entrada a la aplicación
 *  
 */
public class AppBucles
{

    /**
     *  Punto de entrada a la aplicación. 
     *  
     *  
     */
    public static void main(String[] args)
    {
        IUTexto interfaz = new IUTexto(new CalculadoraOctal(), new PintorFiguras());
        interfaz.iniciar();

       
    }
}

