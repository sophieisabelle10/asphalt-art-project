import org.code.neighborhood.*;

public class PainterPlus extends Painter{

 public void turnRight() {
   turnLeft();
   turnLeft();
   turnLeft();
 }
  public void takeAllPaint() {
    takePaint();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
  }
  public void moveFast() {
    while (canMove()){
      move();
    }
  }
  public void paintToEmpty() {
    while(isOnBucket()){
      takeAllPaint();
      paint("white");
      turnRight();
    }
  }
}
