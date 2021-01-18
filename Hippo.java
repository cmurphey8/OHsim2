// color: GRAY if hungry, else WHITE
// eating: true first <hunger> times
// fighting: scratch if hungry, else pounce
// movement: step 5 in random directions
// toString: <hunger>

import java.awt.Color;
import java.util.Random;

public class Hippo extends Critter {
  private int hunger;
  private Random rand;
  private int dir;
  private int steps;
  
  public Hippo(int hunger) {
    hunger = this.hunger;
    rand = new Random();
    steps = 0;
    dir = 0;
  }
  
  public boolean eat() {
    if (hunger > 0) {
      hunger--;
      return true;
    }
    return false;
  }
  
  public Attack fight(String opponent) {
    if (hunger > 0)
      return Attack.SCRATCH;
    else
      return Attack.POUNCE;
  }
  
  // need to override
  public Color getColor() {
    if (hunger > 0)
      return Color.GRAY;
    else
      return Color.WHITE;
  }
  
  // need to override
  public Direction getMove(String[][] grid) {
    if (steps % 5 == 0) {
      dir = rand.nextInt(4);
    }
    steps++;
    switch (dir) {
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
    return String.valueOf(hunger);
  }
}
