package Lab_3.Objects;

public class Outside {

    private String name;

    public Outside(String name) {
        this.name = name;
    }


    public String surrounded(Location location) {

        return name + " окружена " + location.name;
    }
}
