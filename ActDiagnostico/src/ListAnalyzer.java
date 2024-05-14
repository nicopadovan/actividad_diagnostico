import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> lista) {
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 != 0) {
                contador++;
            }

        }
        return contador;
    }

}