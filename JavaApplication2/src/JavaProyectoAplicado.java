import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaProyectoAplicado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> estudiantes = new HashMap<String, String>();
        int opcion;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.println("--------------------");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // para limpiar la pantalla y el buffer

            switch (opcion) {
                case 1: // Espacio para agregar el case de ingreso de alumnos
                    System.out.print("Ingresa el carnet del alumno: ");
                    String carnet = scanner.nextLine();
                    System.out.print("Ingresa el nombre completo del alumno: ");
                    String nombre = scanner.nextLine();
                    estudiantes.put(carnet, nombre);
                    System.out.println("Alumno ingresado exitosamente.");
                    break;

                case 2: // aqui se buscara al alumno
                    System.out.print("Ingresa el carnet del alumno que deseas buscar: ");
                    String carnetBuscar = scanner.nextLine();

                    if (estudiantes.containsKey(carnetBuscar)) {
                        String nombreAlumno = estudiantes.get(carnetBuscar);
                        System.out.println("Alumno encontrado: " + nombreAlumno);
                    } else {
                        System.out.println("Alumno no encontrado, no se puede mostrar");
                    }
                    break;
                    
                case 3: // aqui se debe de eliminar al alumno
                        System.out.print("Ingrese elcarnet del alumno que desea eliminar: ");
                            String carnetEliminar = scanner.nextLine();
                    if (estudiantes.containsKey(carnetEliminar)){
                        String nombreEliminar = estudiantes.remove(carnetEliminar);
                    System.out.println("Alumno eliminado: " + nombreEliminar);
                    } else { 
                        System.out.println("Alumno no encontrado, no se puede eliminar");
                           }
                        break;

                case 4: // para mostrar a todos los alumnos
                    System.out.println( "El listado de alumnos es: " );                    
                    for (Map.Entry<String, String> entry : estudiantes.entrySet()) {
                        System.out.println("Carnet: " + entry.getKey() + ", Nombre: " + entry.getValue());
                    }
                    break;
                case 5: // opcion para salir
                    System.out.println("Saliendo del programa...");
                    
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
