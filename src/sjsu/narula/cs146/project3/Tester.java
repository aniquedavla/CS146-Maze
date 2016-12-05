package src.sjsu.narula.cs146.project3;

/**
 * Created by Rodion on 12/4/16.
 */
public class Tester {
  public static void main(String args[])
  {
    Graph g = new Graph(6);
    System.out.println(g.printMaze());
    Graph g2 = new Graph(2);
    System.out.println(g2.printMaze());

    System.out.print(g.printBFS());
  }
}
