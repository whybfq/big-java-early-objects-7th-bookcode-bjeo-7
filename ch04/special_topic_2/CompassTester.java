public class CompassTester
{
   public static void main(String[] args)
   {
      Compass c = new Compass();
      c.rotate(-45);
      System.out.println(c.getDirection());
      System.out.println("Expected: 315");
      c.rotate(450);
      System.out.println(c.getDirection());
      System.out.println("Expected: 45");
      c.rotate(-500);
      System.out.println(c.getDirection());
      System.out.println("Expected: 265");
   }
}

