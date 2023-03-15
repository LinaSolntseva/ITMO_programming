package Data;

public class LocationTo {
    private Integer x;
    private Double y;
    private String name;

    public LocationTo(Integer x, Double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public LocationTo(Integer x) {
        this.x = x;
    }

    public LocationTo(Double y) {
        this.y = y;
    }

    public LocationTo(String name) {
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}