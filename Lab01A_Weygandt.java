/*
Aidan Weygandt
09/02/21
The purpose of this program is to spell the Word Mississippi vertically using the letters to make each letter
*/

public class Lab01A_Weygandt{

   public static void main(String[] args){//Main code that prints mississippi
      m();//calls m method to print m
      i();//calls i method to print i
      s();//calls s method to print 2 s'
      i();
      s();
      i();
      p();//calls p method to print 2 p'
      i();
   }
   
   private static void m(){//callable method from within the class
      /* M */
      System.out.println("M     M");
      System.out.println("MM   MM");
      System.out.println("M M M M");
      System.out.println("M  M  M");
      System.out.println("M     M");
      System.out.println("M     M");
      System.out.println("M     M");
   }//closes m method
   private static void i(){//callable method from within the class
      /* I */
      System.out.println(" IIIII");
      System.out.println("   I");
      System.out.println("   I");
      System.out.println("   I");
      System.out.println("   I");
      System.out.println("   I");
      System.out.println(" IIIII");
   }
   private static void s(){//callable method from within the class
      /* S */
      System.out.println(" SSSSS ");
      System.out.println("S     S");
      System.out.println("S");
      System.out.println(" SSSSS");
      System.out.println("      S");
      System.out.println("S     S");
      System.out.println(" SSSSS");
      System.out.println(" SSSSS ");
      System.out.println("S     S");
      System.out.println("S");
      System.out.println(" SSSSS");
      System.out.println("      S");
      System.out.println("S     S");
      System.out.println(" SSSSS");
   }//closes double s method
   private static void p(){//callable method from within the class
      /* P */
      System.out.println("PPPPPP ");
      System.out.println("P     P");
      System.out.println("P     P");
      System.out.println("PPPPPP");
      System.out.println("P");
      System.out.println("P");
      System.out.println("P");
      System.out.println("PPPPPP ");
      System.out.println("P     P");
      System.out.println("P     P");
      System.out.println("PPPPPP");
      System.out.println("P");
      System.out.println("P");
      System.out.println("P");
   }//closes double p method
}//closes class