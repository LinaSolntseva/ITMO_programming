package Data;


public class LocationFrom {
    private Long x;
    private int y;
    private Integer z;
    private String name=null;

    public LocationFrom(Long x, int y, Integer z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public LocationFrom(Long x) {
        this.x = x;
    }

    public LocationFrom(int y) {
        this.y = y;
    }

    public LocationFrom(Integer z) {
        this.z = z;
    }

    public LocationFrom(String name) {
        this.name = name;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}