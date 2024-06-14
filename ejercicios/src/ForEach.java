import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Juan", "Pedro","Pepito"));

        for (String nombre : nombres){
            System.out.println(nombre);
        }



        List<List<Integer>> numeros = new ArrayList<>(Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(40, 50, 60),
                Arrays.asList(70, 80, 90)
        ));

        for (List<Integer>lista:numeros){
            for (int numero:lista){
                System.out.println(numero);
            }
            System.out.println();
        }

        //concatenar

        String concatenacion = "";

        for (List<Integer>numbers:numeros){
            concatenacion += numbers;
            System.out.println(concatenacion);
        }



    }
}
