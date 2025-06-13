package controlador;

import modelo.Usuario;
import vista.VistaConsola;

public class ControladorUsuario {
    private VistaConsola vista;

    public ControladorUsuario(VistaConsola vista) {
        this.vista = vista;
    }

    public void procesarUsuario(Usuario usuario) {
        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        vista.mostrarMensaje("Usuario: " + usuario.getNombre());
        vista.mostrarMensaje("Dirección: " + usuario.getDireccion());
    }

    public void verificarEdad(Usuario usuario) {
        if (usuario.getEdad() < 18) {
            vista.mostrarMensaje("El usuario es menor de edad.");
        } else {
            vista.mostrarMensaje("El usuario es mayor de edad.");
        }
    }
}

