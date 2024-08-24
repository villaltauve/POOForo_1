import java.util.Collection;
import java.util.ArrayList;

public class JavaCollections {
    public static void main(String[] args) {
       
        Collection<String> nombres = new ArrayList<>();

  
        nombres.add("Carlos");
        nombres.add("Vladimir");
        nombres.add("Josue");
        nombres.add("Samuel");

      
        System.out.println("Colección original: " + nombres);

        nombres.remove("Samuel");
        nombres.remove("Vladimir");
        nombres.remove("Carlos");

        System.out.println("Colección final: " + nombres);
    }
}
