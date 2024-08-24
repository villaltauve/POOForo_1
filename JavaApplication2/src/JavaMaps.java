import java.util.HashMap;
import java.util.Map;

public class JavaMaps {
    public static void main (String[] args){
      //Declarar map
      Map <String, String> map = new HashMap<>();
      
      //Asignar valores
      map.put("Alumno 1", "Carlos");
      map.put("Alumno 2","Roberto");
      map.put("Alumno 3", "Isaias");
      
      //Mostrar valores
      System.out.println("Listado de alumnos: ");
      for (Map.Entry<String, String> entry: map.entrySet()){
          System.out.println(entry.getKey()+":"+entry.getValue());
          
      }
      
      //Eliminar valores
      map.remove("Alumno 3");
      
      //Mostrar valores despues de eliminar valor
      System.out.println("Contenido del map despues de eliminar 'Alumno 3':");
      for (Map.Entry<String, String> entry: map.entrySet()){
          System.out.println(entry.getKey()+":"+entry.getValue());
          
      }      
      
    }
   
}
