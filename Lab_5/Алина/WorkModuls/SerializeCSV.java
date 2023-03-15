package WorkModuls;

import Data.Coordinates;
import Data.LocationFrom;
import Data.LocationTo;
import Data.Route;
import WorkCollection.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerializeCSV implements CreateRout {
    private ArrayList<Integer> listOfId = new ArrayList<>();
    private Integer id=0;

    public SerializeCSV() {
        listOfId.add(0);
    }

    public Route serialize(String[] listOfTokens){
            List<String> workList= List.of(listOfTokens);
            Pattern pattern= Pattern.compile("\\d*");
            Matcher matcher= pattern.matcher(workList.get(0));
            if (matcher.find()){
                id= Integer.parseInt(workList.get(0));
                workList.subList(1, workList.size()-1);
            }
            switch (workList.size()){
                case (11):{
                    Route route = createRoute(workList.get(0),
                            createCoordianates(Double.valueOf(workList.get(1)),
                            Double.valueOf(workList.get(2))),
                            createFrom(Long.valueOf(workList.get(3)), Integer.parseInt(workList.get(4)), Integer.parseInt(workList.get(5)), workList.get(6)),
                            createTo(Integer.parseInt(workList.get(7)), Double.valueOf(workList.get(8)), workList.get(9)),
                            Integer.parseInt(workList.get(10)));
                    return route;
                }
                case (8):{
                    Route route = createRoute(workList.get(0),
                            createCoordianates(Double.valueOf(workList.get(1)),
                            Double.valueOf(workList.get(2))),
                            createFrom(Long.valueOf(workList.get(3)), Integer.parseInt(workList.get(4)), Integer.parseInt(workList.get(5)), workList.get(6)),
                            null,
                            Integer.parseInt(workList.get(7)));
                    executeSetId(route);
                    return route;
                }
                case (7):{
                    Route route = createRoute(workList.get(0),
                            createCoordianates(Double.valueOf(workList.get(1)),
                            Double.valueOf(workList.get(2))),
                            null,
                            createTo(Integer.parseInt(workList.get(3)), Double.valueOf(workList.get(4)), workList.get(5)),
                            Integer.parseInt(workList.get(6)));
                    executeSetId(route);
                    return route;
                }
                case (4):{
                    Route route = createRoute(workList.get(0),
                            createCoordianates(Double.valueOf(workList.get(1)),
                            Double.valueOf(workList.get(2))),
                            null,
                            null,
                            Integer.parseInt(workList.get(3)));
                    executeSetId(route);
                    return route;
                }
                default:{
                    listOfId.add(Collections.max(listOfId) + 1);
                    return new Route("Default", createCoordianates(0.,0.),null, null, 0);
            }
        }

    }
    public void executeSetId(Route route){
        if (listOfId.contains(id)){
            route.setId(Collections.max(listOfId) + 1);
            listOfId.add(Collections.max(listOfId) + 1);
        }
        else {
            listOfId.add(id);
        }
    }

    @Override
    public Route createRoute(String name, Coordinates coordinates, LocationFrom from, LocationTo to, int distance) {
        return new Route(name, coordinates, from, to, distance);
    }

    @Override
    public Coordinates createCoordianates(Double x, Double y) {
        return new Coordinates(x, y);
    }

    @Override
    public LocationFrom createFrom(Long x, int y, Integer z, String name) {
        return new LocationFrom(x, y, z, name);
    }

    @Override
    public LocationTo createTo(Integer x, Double y, String name) {
        return new LocationTo(x, y, name);
    }
}
