/*
Aidan Weygandt
09/07/2021
This program draws a rocket to the output window and this program should use String variables for placing the name on the rocket
*/
public class Lab01B_Weygandt{

   public static void main(String[] args){//main method that uses other methods to make rocket
      cone();
      module();
      country("United", "States");//takes two string arguments and prints them on rocket
      //country("Russia", "      ");
      //country("Japan ", "      ");
      module();
      cone();
   }//closes main method
   
   private static void cone(){
      System.out.println("   /\\");
      System.out.println("  /  \\");
      System.out.println(" /    \\");
   }//closes cone method
   private static void module(){
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
   }//closes module method
   private static void country(String name1, String name2){
      System.out.println("|      |");
      System.out.println("|" + name1 + "|");
      System.out.println("|" + name2 + "|");
      System.out.println("|      |");
   }//closes country method
}//closes class