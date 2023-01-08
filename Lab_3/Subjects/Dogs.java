package Lab_3.Subjects;

import Lab_3.Objects.Location;

public class Dogs {

    private String name;

    public Dogs(String name) {
        this.name = name;
    }


    public void barking(Location location) {
        System.out.println(name + " лаяли за " + location.name);
    }


    public void chasing(Dunno dunno) {
        System.out.println(name + " преследовали " + dunno.name);
    }

    public void notbehind() {
        System.out.println( name + " уже не были позади");
    }
}