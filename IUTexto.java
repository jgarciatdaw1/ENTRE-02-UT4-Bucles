import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Jon García
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;
    private Utilidades octal;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar(){
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\u000C");
        System.out.println("Introduce numeros para sumar en octal:");
        System.out.println("Numero 1:");
        int numero1 = teclado.nextInt();
        System.out.println("\u000C");
        System.out.println("Introduce numeros para sumar en octal:");
        System.out.println("Numero 2:");
        int numero2 = teclado.nextInt();
        if(octal.estaEnOctal(numero1) && octal.estaEnOctal(numero2)){
                if (octal.contarCifras(numero1) = octal.estaEnOctal(numero2)){
                    calculadora.sumarEnOctal(numero1, numero2);
                    System.out.println("Quieres sumar otros numeros?");
                    String pregunta = teclado.nextLine();
                    if(pregunta == "s" || pregunta == "S"){
                        hacerSumasOctales();
                    }
                else{
                    System.out.println("Uno de los numeros introducidos no esta en octal");
                }
        }
        else{
            System.out.println("Los números no coinciden en cifras");
        }
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\u000C");
        System.out.println("Introduce la altura que quieras para hacer una pirámide:");
        int altura = teclado.nextInt();
        pintor.dibujarFigura(altura);
    }

}
