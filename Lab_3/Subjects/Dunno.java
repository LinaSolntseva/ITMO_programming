package Lab_3.Subjects;

import Lab_3.Objects.Location;

public class Dunno extends People {


   public Dunno(String name) {
      this.name = name;
   }


   @Override
   public void notchasing() {
      System.out.println(" не преследовал");
   }

   @Override
   public void going(Location location) {

   }

   @Override
   public void seemthat() {
      System.out.print(this.name + " думал что ");

   }

}