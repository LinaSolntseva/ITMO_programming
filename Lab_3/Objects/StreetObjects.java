package Lab_3.Objects;

public abstract class StreetObjects implements objectsInterface {

    protected String name;

    @Override
    public String getName(){
        return this.name;
    }

    public abstract void litup();
    public abstract void stay();
    public abstract void blink();
    public abstract void smart();
    public abstract void sparkle();
    public abstract void lightup();



}