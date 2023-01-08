package Lab_3.Subjects;
import Lab_3.Objects.Location;
public abstract class People{

    public static String name;

    public void running(Location location){
        System.out.println(name + " помчался по " + location.name);
    };

    public void coming(Location location) {
        System.out.println(name + " очутился на " + location.name);
    }



    public void recovering(Dunno dunno)  {
        System.out.println( dunno.name + " пришел в себя");
    }


    public abstract void notchasing();

    public abstract void going(Location location);


    public abstract void seemthat();


    public String getName(){
        return this.name;
    }




}