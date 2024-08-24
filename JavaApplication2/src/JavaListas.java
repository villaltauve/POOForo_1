import java.util.List;
import java.util.ArrayList;

public class JavaListas {
    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        
        nombre.add("Carlos");
        nombre.add("Ana");
        nombre.add("Beatriz");
        
        System.out.println("Lista de nombres inicial: " + nombre);
        
        nombre.remove("Carlos");
        System.out.println("Lista despues de remover a Carlos: " + nombre);
        
        nombre.remove(1);
        System.out.println("Lista despues de remover al index 1" + nombre);
    }
}
