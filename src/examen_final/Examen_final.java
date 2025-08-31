
package examen_final;
import java.util.Scanner;
/**
 *
 * @author ANDERSON
 */
public class Examen_final {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
            //declarando variables
        double compra1, compra2,compra3,tc, promedio;
        String empleado;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
         System.out.println("Ingresar nombre del empleado:");
            empleado=lectura.next();
            System.out.println("Ingresar número 1:");
            compra1=lectura.nextDouble();
            System.out.println("Ingresar número 2:");
            compra2=lectura.nextDouble();
            System.out.println("Ingresar número 3:");
            compra3=lectura.nextDouble();
            System.out.println("RESULTADOS OBTENIDOS TOTALES:");
           // procesos de datos  
           tc=compra1+compra2+compra3;
           promedio =tc/3;
           //salida de datos
           //Resultados
           System.out.println("TOTAL COMPRAS:"+  tc);
           System.out.println("PROMEDIO DE COMPRAS:"+  promedio);  
    }
}
