package quest_1;
import  java.util.Arrays;
import  java.util.ArrayList;
import java.util.List;

public class Busca {
    // -- array de 10 elementos
    private final String[] array = {"Giovanni", "Ana clara", "Rodrigo", "Guilherme"};
    private  final List <String> lista  = new ArrayList<String>();

    public String[] getArray() {
        return array;
    }

    static public void OrdenarArray(String[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);


    }

    public static void main(String[] args) {
        Busca p = new Busca();
        OrdenarArray(p.getArray());
    }
}
