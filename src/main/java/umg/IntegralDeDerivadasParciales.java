package umg;

import org.matheclipse.core.eval.ExprEvaluator;
import java.util.Scanner;

public class IntegralDeDerivadasParciales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExprEvaluator eval = new ExprEvaluator();

        try {
            System.out.print("Ingresa la función en términos de X y Y: ");
            String expresion = scanner.nextLine();

            try {
                String derivadaRespectoX = eval.evaluate("D(" + expresion + ", x)").toString();
                System.out.println("Derivada respecto a x: " + derivadaRespectoX);
            } catch (Exception e) {
                System.err.println("Error al calcular la derivada respecto a x: " + e.getMessage());
            }

            try {
                String derivadaRespectoY = eval.evaluate("D(" + expresion + ", y)").toString();
                System.out.println("Derivada respecto a y: " + derivadaRespectoY);
            } catch (Exception e) {
                System.err.println("Error al calcular la derivada respecto a y: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("Error en la entrada de datos o ejecución: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}