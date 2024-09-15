import org.code.neighborhood.*;
public class MuralPainter extends PainterPlus {

  // Paints each row of The Neighborhood with the color where "size" is the size of the grid
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintRow(color);
      turnToWest();
      if (canMove("south")) {
        paintRow(color);
        turnToEast();
      }
    }
    paintRow(color);
    turnAround();
    moveToCorner();
  }

  // Paints a line with the color where the length of the line is specified by spaces
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      if (canMove()) {
        move();
      }
    }
    paint(color);
  }

  public void paintLine(String color, int size) {
    while (size > 0) {
      paint(color);
      move();
      size--;
    }
  }

  // Turns the MuralPainter to the next row to face west if it is currently facing east
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  // Turns the MuralPainter to the next row to face east if it is currently facing west
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  //Turns the MuralPainter around to face the opposite direction
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  //Resets the MuralPainter object to the starting location
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();
      while (canMove()) {
        move();
      }
      turnLeft();
      while (canMove()) {
        move();
      }
      turnAround();
    }
  }

  //Moves the MuralPainter to the bottom right corner
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    turnRight();
    while (canMove()) {
      move();
    }
  }
  
}