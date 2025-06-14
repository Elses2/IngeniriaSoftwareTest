package controlador;

import modelo.Usuario;
import vista.VistaConsola;
import modelo.Direccion;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After; 


public class TestControlador{


  private ControladorUsuario controlador;
  private VistaConsola vista;
  private Direccion dire;


  @Before
  public void setUp(){

   vista= mock(VistaConsola.class);
   controlador= new ControladorUsuario(vista);
   dire= new Direccion("Malvinas","Argentinas");

  }

  @Test(expected = IllegalArgumentException.class)
  public void procesarTrue(){
    Usuario user= new Usuario(null, 23, dire);
    controlador.procesarUsuario(user);
  }

  @Test
  public void procesarNormal(){

    Usuario user= new Usuario("Juan",23, dire);
    controlador.procesarUsuario(user);
    verify(vista).mostrarMensaje("Usuario: Juan");
    verify(vista).mostrarMensaje("Dirección: Malvinas, Argentinas");
  }

  @Test 
  public void testEdadMayor(){

    Usuario user= new Usuario("Juan", 23, dire);
    controlador.verificarEdad(user);
    verify(vista).mostrarMensaje("El usuario es mayor de edad.");


  }
  @Test
  public void testMenor(){

    Usuario user= new Usuario("Juan", 5, dire);
    controlador.verificarEdad(user);
    verify(vista).mostrarMensaje("El usuario es menor de edad.");

  }

}
