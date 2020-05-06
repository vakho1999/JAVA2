package ge.btu.vakho.kavtaradze.Weather.main;

import ge.btu.vakho.kavtaradze.Weather.model.Weather;

import java.util.Arrays;
import java.util.List;

public class Singlton{

    public static List<Weather> Weatherlist = Arrays.asList(
            new Weather("Tbilisi","20","15","10",DirectionType.EAST,"20"),
            new Weather("Batumi","22","13","12",DirectionType.SOUTH,"20"),
            new Weather("Zugdidi","22","13","12",DirectionType.WEST,"20"),
            new Weather("Lentexi","18","13","23",DirectionType.WEST,"20")
    );


}
