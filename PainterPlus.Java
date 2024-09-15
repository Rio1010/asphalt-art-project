import org.code.neighborhood.*;

public class PainterPlus extends Painter {

//turn right
  public void turnRight () {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
//paint till empty  
  public void paintToEmpty (String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

// take all paint
  public void takeAllPaint () {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // can move in direction -> move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  // Paints and moves three spaces
  public void Dashed3Lines (String color) {
    while(hasPaint()){
      if(canMove("east")){
        move();
      }
      paint(color);
      move();
    }
  }











}