package ge.btu.vakho.kavtaradze.currency.main;

import ge.btu.vakho.kavtaradze.currency.model.currency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


import java.util.Arrays;

import java.util.List;


class Singlton{
    public static List<currency> currencyList = Arrays.asList(
            new currency("USD", 3.1600f, 3.2000f),
            new currency("EUR" ,3.4250f,3.4750f),
            new currency("GBP",3.8400f,3.9400f),
            new currency("RUB" ,4.1200f,4.2500f),
            new currency("TRY",0.4000f,0.4700f),
            new currency("AZN",1.600f,1.8400f));

}
@Path("/currency")
public class main {


    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<currency> getCurrencies() {
        System.out.println(Singlton.currencyList);
        return Singlton.currencyList;
    }

    @POST
    @Path("/buy/{to}/{amount}")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    @Consumes(MediaType.APPLICATION_JSON) // იღებს ჯეისონს
    public float buy(@PathParam("to") String Name, @PathParam("amount") float amount) {
        List<currency> list1 = Singlton.currencyList;
        for (currency var: list1)
        {
            if (var.getCur().equals(Name)){
                return (float) var.getBuy(amount);
            }
        }
        return 0f;

    }

    @POST
    @Path("/sell/{to}/{amount}")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    @Consumes(MediaType.APPLICATION_JSON) // იღებს ჯეისონს
    public float sell(@PathParam("to") String Name, @PathParam("amount") float amount) {
        List<currency> list2 = Singlton.currencyList;
        for (currency var : list2) {
            if (var.getCur().equals(Name)) {
                return (float) var.getSell(amount);
            }
        }
        return 0f;
    }


}