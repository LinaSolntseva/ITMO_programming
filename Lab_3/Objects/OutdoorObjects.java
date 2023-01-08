public class OutdoorObjects extends StreetObjects {

    public OutdoorObjects(String name){
        this.name = name;
    }


    @Override
    public void litup() {
        System.out.println(" зажглись");
    }

    @Override
    public void stay() {
        System.out.println(" стояли");
    }

    @Override
    public void blink() {
        System.out.println(" замигали");
    }

    @Override
    public void smart() {
        System.out.println(" стали наряднее");

    }

    @Override
    public void sparkle() {
        System.out.println(" засверкали");

    }

    @Override
    public void lightup() {
        System.out.println(" осветились");

    }
}
