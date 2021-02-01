public class Gallery2
{
   public static void main(String[] args)
   {
      final int MAX_WIDTH = 720;
      final int GAP = 10;
      final int PICTURES = 20;

      Picture pic = new Picture();
      pic.load("picture1.jpg");
      Picture pic2 = new Picture();
      pic2.load("picture2.jpg");
      pic2.move(pic.getWidth(), 0);
   }
}

