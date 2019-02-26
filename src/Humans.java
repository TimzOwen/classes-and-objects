import com.owen.Main;

public class Humans
  {
      public static void main(String args[])
      {
       Main man = new Main();

       Main john = new Main();

       man.name = "owen";
       john.gender = "Female";

       man.height = 50;
       john.height = 45;

       man.age = 40;
       john.age = 56;

       man.gender = "Male";
       john.name = "Johnn";

       man.speak();

       man.getMaried();

       john.speak();

      }
  }
