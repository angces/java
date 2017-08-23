package mx.com.angces.java.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mx.com.angces.java.DTO.Persona;
 
@Path("/servicioPersonas/")
public class HolaMundoRest {
 
  public HolaMundoRest() {}
 
  @POST
  @Path("/personas")
  @Produces("application/json")
  @Consumes(MediaType.APPLICATION_JSON)
  public void metodoPOST(Persona persona) {
  System.out.println("----------HOLA, este es un método POST----------"); 
  System.out.println(persona.getNombre() + " " + persona.getApellidoPaterno());
  }
  
  @GET
  @Path("/personas")
  @Produces("text/html")
  public String metodoGET() {
  System.out.println("----------HOLA, este es un método GET----------"); 
  return "<html lang=\"en\"><body><h1>Hola Mundo!!</h1></body></html>";
  }
}