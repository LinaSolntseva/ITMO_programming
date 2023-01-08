package Lab_3.Objects;

public class CurrentAttraction extends Attractions {
    public CurrentAttraction(String name){
        this.name = name;
    }

    @Override
    public void rotate() {
        System.out.println(" крутились");
    }

    @Override
    public void spin() {
        System.out.println(" вертелись");

    }

    @Override
    public void sway() {
        System.out.println(" качались");

    }

    @Override
    public void stagger() {
        System.out.println(" шатались");

    }

    @Override
    public void shine() {
        System.out.println(" сияли");

    }

    @Override
    public void kick() {
        System.out.println(" брыкались");

    }


}
