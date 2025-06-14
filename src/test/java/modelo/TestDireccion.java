package modelo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;



public class TestDireccion{


 private Direccion dire;

 @Before
 public void setUp(){

    dire= new Direccion("Malvinas","VillaMercedes");
 }

 @Test 
 public void testGetCalle(){

    assertEquals("Malvinas", dire.getCalle());

 }

 @Test 
 public void testGetCiudad(){


  assertEquals("VillaMercedes", dire.getCiudad());

 }
  @Test
  public void testToString(){
  
      assertEquals("Malvinas, VillaMercedes", dire.toString());
  }

   @Test
    public void testGetCalleNotNull() {
    assertNotNull(dire.getCalle());
}

}





