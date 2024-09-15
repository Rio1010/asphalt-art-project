import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
//muralpainter for background
    MuralPainter b = new MuralPainter();
    b.paintBackground("yellow", 10);
    
//picpainter for paintinng Bill Cipher
    picPainter p = new picPainter ();
    p.paintBill();

    
  }
}