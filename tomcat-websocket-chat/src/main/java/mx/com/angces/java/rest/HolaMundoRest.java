package mx.com.angces.java.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mx.com.angces.java.DTO.Persona;
 
@Path("/servicioPersonas/")
@Produces("application/json")
public class HolaMundoRest {
 
  public HolaMundoRest() {}
 
  @POST
  @Path("/personas")
  @Consumes(MediaType.APPLICATION_JSON)
  public void addPersona(Persona persona) {
   
  System.out.println(persona.getNombre() + " " + persona.getApellidoPaterno());
  }
}