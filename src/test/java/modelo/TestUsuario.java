package modelo;


import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.After;




public class TestUsuario{

  private Direccion dire;
  private Usuario user;


  @Before
  public void setUp(){

    dire= new Direccion("Malvinas","Argentinas");
    user= new Usuario("Juan",23,dire);
  }

  @Test
  public void testGetNombre(){
    assertEquals("Juan", user.getNombre());
  }
  @Test
  public void testEdad(){
    
    assertEquals(23, user.getEdad()); 
  }

  
}
