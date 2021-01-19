// color: black
// eating: hungry at start, after fighting
// fighting: roar at ant, else pounce
// movement: 3x3 square
// toString: {"^", ">", "V", "<"}

import java.awt.Color;

public class Vulture extends Critter {
  private boolean eaten;

  public Vulture() {
    this.eaten = false;
  }
  
  public boolean eat() {
    if (this.eaten)
      return false;
    else
      return true;
  }
  
  public Attack fight(String opponent) {
    this.eaten = false;
    if (opponent == "%")
      return Attack.ROAR;
    else
      return Attack.POUNCE;
  }
  
  public Color getColor() {
    return Color.BLACK;
  }  
}
