import java.util.Scanner;

/**
   This program prints a description of an earthquake of a given magnitude.
*/
public class EarthquakeRunner
{
//   public enum F {SINGLE, MARRIED, MARRIED_FILING};

   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a magnitude on the Richter scale: ");
      double magnitude = in.nextDouble();
      Earthquake quake = new Earthquake(magnitude);
      System.out.println(quake.getDescription());
   }
}

