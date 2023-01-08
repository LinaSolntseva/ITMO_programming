package Lab_3;

import Lab_3.Moves.Surrounded;
import Lab_3.Moves.actionsDogs;
import Lab_3.Moves.actionsDunno;
import Lab_3.Moves.actionsMoonshorties;
import Lab_3.Objects.*;
import Lab_3.Subjects.*;


public class Main implements actionsDunno, actionsDogs, actionsMoonshorties, createSubjects {
    public static void main(String[] args) {
        Main main= new Main();
        People dunno = main.createDunno();
        Outside outside = new Outside("Улица");
        Dogs dogs = new Dogs("Собаки");
        OutdoorObjects Buildings = new OutdoorObjects("Высокие дома");
        Evening evening = new Evening("Вечер");
        main.running((Dunno) dunno);
        Surrounded.surrounded(outside, Location.FENCES);
        main.barking(dogs);
        main.seemThat((Dunno) dunno);
        main.chasing(dogs, (Dunno) dunno);
        main.recovering((Dunno) dunno);
        main.coming((Dunno) dunno);
        main.notbehind(dogs);
        main.coming(evening);
        main.going(new MoonShorties("Лунные коротышки"));
        People nobody = main.createNobody();
        nobody.notchasing();



        System.out.print(Buildings.getName());
        Buildings.stay();



        for (int i = 0; i < 5;i++) {


            String[] names = new String[]{"Фонари", "Витрины магазинов", "Световые рекламы", "Магазины", "Огоньки"};
            int index = (int) ((Math.random() * (4 - 0 + 1) + 0));
            OutdoorObjects object = new OutdoorObjects(names[index]);

            int x = (int) ((Math.random() * (5 - 1 + 1) + 1));
            if (x == 1) {
                System.out.print(object.getName());
                object.sparkle();
            }
            else if (x == 2){
                System.out.print(object.getName());
                object.litup();}

            else if (x == 3) {
                System.out.print(object.getName());
                object.lightup();
            }
            else if (x == 4) {
                System.out.print(object.getName());
                object.blink();
            }
            else if (x == 5) {
                System.out.print(object.getName());
                object.smart();
            }
        }


        for (int i = 0; i < 6;i++) {

            String[] names1 = new String[]{"Качели", "Карусели", "Спиральные спуски", "Прыгающие лошадки", "Летающие велосипеды", "Чертовы колеса"};
            int index1 = (int) ((Math.random() * (5 - 0 + 1) + 0));
            CurrentAttraction object1 = new CurrentAttraction(names1[index1]);

            int y = (int) ((Math.random() * (6 - 1 + 1) + 1));
            if (y == 1) {
                System.out.print(object1.getName());
                object1.rotate();
            }
            else if (y == 2) {
                System.out.print(object1.getName());
                object1.spin();
            }
            else if (y == 3) {
                System.out.print(object1.getName());
                object1.sway();
            }
            else if (y == 4){
                System.out.print(object1.getName());
                object1.stagger();
            }
            else if (y == 5) {
                System.out.print(object1.getName());
                object1.shine();
            }
            else if (y == 6) {
                System.out.print(object1.getName());
                object1.kick();
            }

        }

    }



    @Override
    public void running(Dunno dunno) {
        dunno.running(Location.STREET);
    }

    @Override
    public void recovering(Dunno dunno) {
        dunno.recovering(dunno);

    }

    @Override
    public void coming(Dunno dunno) {
        dunno.coming(Location.BUSYSTREET);

    }


    public void coming(Evening evening) {
        evening.coming();

    }

    @Override
    public void going(MoonShorties moonShorties) {
        moonShorties.going(Location.SIDEWALK);

    }

    @Override
    public void seemThat(Dunno dunno) {
        dunno.seemthat();

    }

    @Override
    public void barking(Dogs dogs) {
        dogs.barking(Location.FENCES);
    }

    @Override
    public void chasing(Dogs dogs, Dunno dunno) {
        dogs.chasing(dunno);

    }


    @Override
    public void notbehind(Dogs dogs) {
        dogs.notbehind();

    }

    @Override
    public Dunno createDunno() {
        return new Dunno("Незнайка");
    }

    @Override
    public Nobody createNobody() {
        return new Nobody ("Никто");
    }



}
