package principal;

import modelo.Usuario;
import modelo.Direccion;
import vista.VistaConsola;
import controlador.ControladorUsuario;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        ControladorUsuario controlador = new ControladorUsuario(vista);

        Direccion dir1 = new Direccion("Calle Falsa 123", "Springfield");
        Direccion dir2 = new Direccion("Av. Siempre Viva 742", "Shelbyville");

        Usuario usuario1 = new Usuario("Lucía", 17, dir1);
        Usuario usuario2 = new Usuario("Carlos", 25, dir2);

        try {
            controlador.procesarUsuario(usuario1);
            controlador.verificarEdad(usuario1);

            controlador.procesarUsuario(usuario2);
            controlador.verificarEdad(usuario2);
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        }
    }
}

