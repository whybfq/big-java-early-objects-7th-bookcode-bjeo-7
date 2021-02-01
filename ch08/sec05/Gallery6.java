public class Gallery6
{
   public static void main(String[] args)
   {
      final int MAX_WIDTH = 720;
      final int GAP = 10;
      final int PICTURES = 20;

      Picture pic = new Picture();
      pic.load("picture1.jpg");
      int x = 0;
      int y = 0;
      int maxY = 0;

      for (int i = 2; i <= PICTURES; i++)
      {
         maxY = Math.max(maxY, y + pic.getHeight());
         Picture previous = pic;
         pic = new Picture();
         pic.load("picture" + i + ".jpg");
         x = x + previous.getWidth() + GAP;
         if (x + pic.getWidth() >= MAX_WIDTH)
         {
            x = 0;
            y = maxY + GAP;
         }
         pic.move(x, y);
      }
   }
}

