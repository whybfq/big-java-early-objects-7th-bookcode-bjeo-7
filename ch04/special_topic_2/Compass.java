public class Compass
{
   private int direction;
   /**
      Constructs a compass facing north.
   */
   public Compass()
   {
      direction = 0;
   }
   
   /**
      Rotates the compass by a given angle.
      @param turn the turning angle
   */
   public void rotate(int turn)
   {
      direction = Math.floorMod(direction + turn, 360);
      // Try with
      // direction = (direction + turn) % 360;
   }

   /**
      Gets the current direction of this compass
      @return the direction between 0 and 359
   */
   public int getDirection()
   {
      return direction;
   }
}

