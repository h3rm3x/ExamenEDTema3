import java.util.Scanner;

/**
 * programa suma, para calcular la suma de dos variables entradas por teclado
 * @version v1.0
 * @author Miquel
 * @see Para mas informacion ver <a href="https://google.com">Google</a>
 */


public class FuncionSuma {
    /**
     * Variable para guardar el primer sumando
     */
    private static int primerSumando;
    /**
     * variable para gurdar el segundo sumando
     */
    private static int segundoSumando;

    /**
     * funcion principal del programa
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Introduce el primer sumando:");
        primerSumando = in.nextInt();
        in.nextLine();
        System.out.println("Introduce el segundo sumando:");
        segundoSumando = in.nextInt();
        in.nextLine();
        System.out.println("La suma es: " + suma(primerSumando, segundoSumando));

        in.close();

    }

    /**
     * Funcion que realiza la suma de los dos operadores
     * @param sumando1- primer parametro de la operacion suma
     * @param sumando2- segundo parametro de la operacion suma
     * @return Devuelve el resultado de sumar los dos sumandos
     */


    private static int suma (int sumando1, int sumando2) {
        return sumando1+sumando2;
    }

}
