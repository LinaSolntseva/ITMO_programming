package Lab_3.Subjects;

import Lab_3.Objects.Location;

import java.util.Arrays;

public class Dunno extends People {


   private String[] listOfClothes = {"джинсы", "рубашка", "рваные носки"};
   private String mood;
   public Dunno(String name, String mood) {
      this.name = name;
      this.mood = mood;
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

   public String info() {
      Clothes clothes = new Clothes(listOfClothes);
      Mood mood = new Mood("небо было ясное");
      return name + " был" + clothes.showClothes() + ". " + mood.showMood();
   }


   static class Clothes {
      public String[] clothes;
      public Clothes(String[] clothes) {
         this.clothes = clothes;
      }

      String showClothes() {
         return " в " + Arrays.toString(clothes);
      }
   }

   class Mood {
      private final String reason;

      public Mood(String reason) {
         this.reason = reason;
      }

      String showMood() {
         return "Настроение у " + name + " было " + mood + ", потому что " + reason;
      }

   }

}