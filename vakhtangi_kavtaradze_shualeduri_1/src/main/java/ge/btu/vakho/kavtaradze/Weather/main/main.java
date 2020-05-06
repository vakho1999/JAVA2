package ge.btu.vakho.kavtaradze.Weather.main;

import ge.btu.vakho.kavtaradze.Weather.model.Weather;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


import java.util.List;

@Path("/")
public class main {


    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeathers() {

        return Singlton.Weatherlist;
    }

    @POST
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Weather buy(@PathParam("city") String Name) {
        List<Weather> list1 = Singlton.Weatherlist;
        int i=0;
        for (Weather var: list1)
        {

            if (var.getCity().equals(Name)){
                return  list1.get(i);
            }
            i++;
        }
        return (Weather) list1;
    }


}