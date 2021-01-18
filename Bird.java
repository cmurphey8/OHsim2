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
    index = 0;
    steps = 0;
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
  
  // need to override
  public Color getColor() {
    return Color.BLUE;
  }
  
  // need to override
  public Direction getMove(String[][] grid) {
    if (steps % 3 == 0 && steps > 0) {
      index++;
      index %= 4;
    }
    steps++;
    switch (index) {
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
    return symbol[index];
  }
}
