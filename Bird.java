// color: blue
// eating: none
// fighting: roar at ant, else pounce
// movement: 3x3 square
// toString: {"^", ">", "V", "<"}

import java.awt.Color;

public class Bird extends Critter {
  private String[] symbol = {"^", ">", "V", "<"}; 
  private int index;
  private int steps;

  public Bird() {
    this.index = 0;
    this.steps = 0;
  }
  
  public boolean eat() {
    return false;
  }
  
  public Attack fight(String opponent) {
    if (opponent == "%")
      return Attack.ROAR;
    else
      return Attack.POUNCE;
  }
  
  public Color getColor() {
    return Color.BLUE;
  }
  
  public Direction getMove(String[][] grid) {
    if (this.steps % 3 == 0 && this.steps > 0) {
      this.index++;
      this.index %= 4;
    }
    this.steps++;
    switch (this.index) {
      case 0:
        return Direction.NORTH;
      case 1:
        return Direction.EAST;
      case 2:
        return Direction.SOUTH;
      case 3:
        return Direction.WEST;
    }
    return Direction.CENTER;
  }
  
  public String toString() {
    return this.symbol[this.index];
  }
}
