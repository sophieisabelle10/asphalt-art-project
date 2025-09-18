import org.code.neighborhood.*;

public class FramePainter extends PainterPlus{
// this method helps create the frame for the icon
  public void paintFrame() {
//there is a series of while loops to allow the painter to move around the frame of the icon and create an image
    while (canMove ("east")) {
      paint("pink");
      move();
      paint("pink");
    }

    turnRight();
    
    while(canMove("south")){
      paint("pink");
      move();
    }

    turnRight();

    while(canMove("west")){
      paint("pink");
      move();
    }

    turnRight();

    while(canMove("north")){
      paint("pink");
      move();
    }
  }
}