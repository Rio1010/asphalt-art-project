import org.code.neighborhood.*;

public class picPainter extends MuralPainter {
  
/*
 * paints the picture Bill Cipher (from Gravity Falls)
 */
  public void paintBill () {
    //starts at the specific position
    startPosition();
    // paints the outline
    paintTriangle("black", 2);
    // paints legs
    paintLegs("black");
    // paints the hat
    paintHat("black");
    // makes teh eyes
    paintEye("black");
    // resets position
    resetp();
  }

/*
 * paints the eye using paint line
 */
  public void paintEye(String color){
    // to get to the spot the eye is supposed to be
    resetp();
    startPosition();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    // paints two lines for the eye
    paintLine("black",3);
    paint(color);
    turnLeft();
    move();
    turnLeft();
    paintLine("black",3);
    paint(color);
  } //end of eye
  
 /*
  * paints the hat using while loop and if statment
  */
  public void paintHat(String color){
    // gets to the start of hat
    resetp();
    startPosition();
    turnAround();
    move();
    move();
    move();
    move();
    turnAround();
    // paints the first part
    paintLine("black", 10);
    resetp();
    startPosition();
    turnAround();
    move();
    turnRight();
    while (canMove()){
      if (isFacingNorth()){
        move();
        paint(color);
      }
    }
    turnRight();
    move();
    if (isFacingEast()){
      turnRight();
    }
    paintLine("black", 5);
    paint(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);
    
    while (canMove()){
      if (isFacingNorth()){
        move();
        paint(color);
      }
    }
    turnRight();
    move();
    turnRight();
    paintLine("black", 6);
  }//end of hat

/*
 * paints the legs using paintLine
 */
  public void paintLegs (String color){
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    paintLine (color, 4);
    turnLeft();
    move();
    paint(color); 
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnRight();
    paint(color); 
    move();
    paint(color);
    turnLeft();
    paintLine (color, 5);
  }//end of legs
  
/*
 * paints the triangle
 */
  public void paintTriangle(String color, int size){
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
    move();
    turnRight();

    while (size < 17) {
      paint(color);
      // the number of blank spaces between the left and right black outline
      for (int i = 0; i < size; i++) {
        move();
      }
      move();
      paint(color);
      turnLeft();
      move();
      turnLeft();
      paint(color);
      // the number of blank spaces between the left and right black outline
      for (int i = 0; i < size; i++) {
        move();
      }
      move();
      paint(color);
      move();
      turnRight();
      move();
      turnRight();
      size = size + 2;
    }
    move();
    paintLine (color, 18);
  } //end of ourline

/*
 * goes to the starting position
 */
  public void startPosition (){
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
  }//end of sp
  
/*
 * goes to the left corner (where it started)
 */
  public void resetp (){
    while (!isFacingEast()) {
      turnLeft();
    }
    turnLeft();
    while (canMove()) {
      move();
    }
    turnLeft();
    while (canMove()) {
      move();
    }
    turnAround();
  } //end of rp


  
} //end of class