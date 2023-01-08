package Lab_3.Objects;

public abstract class Attractions implements objectsInterface {
    protected String name;



    public abstract void rotate();

    public abstract void spin();
    public abstract void sway();
    public abstract void stagger();
    public abstract void shine();
    public abstract void kick();
    @Override
    public String getName(){
        return this.name;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return("[" + this.getClass().toString().split(" ")[1] + "] " + name);
    }

}