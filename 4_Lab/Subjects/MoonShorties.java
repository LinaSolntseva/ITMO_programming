package Lab_3.Subjects;

import Lab_3.Objects.Location;

public class MoonShorties extends People {



    public MoonShorties(String name) { this.name = name; }


    @Override
    public void notchasing() {
        System.out.println(" ");
    }

    @Override
    public void going(Location location) {
        System.out.println(name + " шагали по " + location.name);

    }

    @Override
    public void seemthat() {

    }


}