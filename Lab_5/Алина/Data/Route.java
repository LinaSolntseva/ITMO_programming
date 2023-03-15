package Data;


public class Route {
    private int id=0;
    private String name;
    private Coordinates coordinates;

    private LocationFrom from;

    private LocationTo to;
    private int distance;


    public Route(String name, Coordinates coordinates, LocationFrom from, LocationTo to, int distance) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Route(int id) {
        this.id = id;
    }

    public Route(String name) {
        this.name = name;
    }

    public Route(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Route(LocationFrom from) {
        this.from = from;
    }

    public Route(LocationTo to) {
        this.to = to;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    public LocationFrom getFrom() {
        return from;
    }

    public void setFrom(LocationFrom from) {
        this.from = from;
    }

    public LocationTo getTo() {
        return to;
    }

    public void setTo(LocationTo to) {
        this.to = to;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
