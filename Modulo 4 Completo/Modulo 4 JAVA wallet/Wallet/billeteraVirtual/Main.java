package billeteraVirtual;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Usuario usuario = null;

        // Crear algunos usuarios para probar el inicio de sesión
        Usuario usuario1 = new Usuario("Sabina", "1234");
        Usuario usuario2 = new Usuario("Ricardo", "");

        // Agregar los usuarios a una lista (esto sería en tu aplicación una base de datos o alguna estructura de datos similar)
        // Aquí simplemente los almacenamos en un array para simplificar
        Usuario[] usuarios = {usuario1, usuario2};

        // Lógica de inicio de sesión
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contrasena = scanner.nextLine();

            // Verificar si las credenciales son válidas
            for (Usuario u : usuarios) {
                if (u.getNombreUsuario().equals(nombreUsuario) && u.getContrasena().equals(contrasena)) {
                    usuario = u;
                    loggedIn = true;
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
            }
        }

        // Menú principal bonito y simple que no hace nada XDDD
        int opcion;
        do {
            System.out.println("\nBienvenido, " + usuario.getNombreUsuario() + "! Elija una opción:");
            System.out.println("1. Ver cuenta");
            System.out.println("2. Realizar transferencia");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Convertir moneda");
            System.out.println("5. Contactos");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Lógica para ver cuenta
                    System.out.println("Mostrar cuenta...");
                    break;
                case 2:
                    // Lógica para realizar transferencia
                    System.out.println("Realizar transferencia...");
                    break;
                case 3:
                    // Lógica para realizar retiro
                    System.out.println("Realizar retiro...");
                    break;
                case 4:
                    // Lógica para convertir moneda
                    System.out.println("Convertir moneda...");
                    break;
                case 5:
                    // Lógica para mostrar contactos
                    System.out.println("Mostrar contactos...");
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
}