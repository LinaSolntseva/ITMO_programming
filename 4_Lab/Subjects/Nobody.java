package Lab_3.Subjects;

import Lab_3.Objects.Location;

public class Nobody extends People {

    public static String name;

    public Nobody(String name) {
        this.name = name;
    }


    @Override
    public void notchasing(){
        System.out.println(name + " не преследовал");
    }

    @Override
    public void going(Location location) {
        System.out.println("   ");
    }

    @Override
    public void seemthat() {
        System.out.println( name + " думал что " );
    }



}