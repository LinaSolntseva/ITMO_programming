package Lab_3.Objects;

public class CurrentAttraction extends Attractions {
    public CurrentAttraction(String name){
        this.name = name;
    }

    @Override
    public void rotate() {
        {
            class Writer{
                void exWrite(){
                    System.out.println(" крутились");
                }
            }
            Writer writer= new Writer();
            writer.exWrite();
        }
    }

    @Override
    public void spin() {
        {
            class Writer{
                void exWrite(){
                    System.out.println(" вертелись");
                }
        }
            Writer writer= new Writer();
            writer.exWrite();
        }
    }

    @Override
    public void sway() {
        {
            class Writer{
                void exWrite(){
                    System.out.println(" качались");
                }
            }
            Writer writer= new Writer();
            writer.exWrite();
        }
    }

    @Override
    public void stagger() {
        {
            class Writer{
                void exWrite(){
                    System.out.println(" шатались");
                }
            }
            Writer writer= new Writer();
            writer.exWrite();
        }
    }

    @Override
    public void shine() {
        {
            class Writer{
                void exWrite(){
                    System.out.println(" сияли");
                }
            }
            Writer writer= new Writer();
            writer.exWrite();
        }
    }

    @Override
    public void kick() {
        {
            class Writer{
                void exWrite(){
                    System.out.println(" брыкались");
                }
            }
            Writer writer= new Writer();
            writer.exWrite();
        }
    }
}
