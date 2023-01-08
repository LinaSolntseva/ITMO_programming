package Lab_3.Objects;

public enum Location {
    STREET("Улица"),
    SIDEWALK("Тротуар"),
    BUSYSTREET("Оживленная улица"),
    FENCES("Заборы"),
    NOWHERE("никуда");


    public final String name;
    Location(String name){
        this.name  = name;
    }

}