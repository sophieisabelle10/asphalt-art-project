import org.code.neighborhood.*;
// this class is the overall run of code
public class NeighborhoodRunner {
  public static void main(String[] args) {
    // here we call the painters that are used throughout the code while creating the image
FramePainter sophie = new FramePainter();
BackgroundPainter bob = new BackgroundPainter();
HeartPainter molly = new HeartPainter();

    // these methods call the painters to do a series of tasks to create our image
    bob.paintBackground("white");
    sophie.paintFrame();

    molly.turnRight();
    molly.moveQuick();
    molly.turnLeft();
    molly.moveQuick();

    //this code paints the Top of the heart
    molly.paintHeartTop();
    molly.moveQuick();
    molly.paintHeartTop();
    
    molly.turnRight();
    molly.move();
    molly.paint("black");
    molly.turnLeft();
    molly.move();
    molly.turnRight();
    molly.move();
    molly.paint("black");
    molly.turnLeft();
    molly.move();
    molly.turnRight();
    molly.move();

    //painting the right side of the heart outline
    molly.paintHeartSide();
    molly.paintSide();

    //painting bottom of the heart
    molly.paint("black");
    molly.move();
    molly.paint("black");
    molly.move();

    // painting left side of the heart
    molly.paintLeftSide();
    molly.move();
    molly.paint("black");
    molly.move();
    molly.paint("black");
    molly.move();
    molly.paint("black");
    molly.move();
    molly.paint("black");
    molly.move();
    molly.paint("black");
    molly.move();
    molly.turnRight();
    molly.move();
    molly.paint("black");
    molly.turnLeft();
    molly.move();
    molly.turnRight();
    molly.move();
    molly.paint("black");
    molly.move();
    molly.turnLeft();
    molly.move();
    molly.paint("black");

    //method to paint the ending of the heart
    molly.paintTopMiddle();
      
  }
}