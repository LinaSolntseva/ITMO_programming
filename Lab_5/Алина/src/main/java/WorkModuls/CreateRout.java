package WorkModuls;

import Data.Coordinates;
import Data.LocationFrom;
import Data.LocationTo;
import Data.Route;

public interface CreateRout {
    Route createRoute (String name, Coordinates coordinates, LocationFrom from, LocationTo to, int distance);
    Coordinates createCoordianates(Double x, Double y);
    LocationFrom createFrom(Long x, int y, Integer z, String name);
    LocationTo createTo(Integer x, Double y, String name);
}
