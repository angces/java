package mx.com.angces.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("holamundo")
public class HolaMundoRest {
 
  public HolaMundoRest() {}
 
  @GET
  @Produces("text/html")
  public String getHtml(@PathParam("type") String nombre) {
    return "<html lang=\"en\"><body><h1>Hola " + nombre + "!!</h1></body></html>";
  }
 
}