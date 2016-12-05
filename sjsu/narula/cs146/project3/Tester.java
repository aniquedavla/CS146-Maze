package sjsu.narula.cs146.project3;

public class Tester {

  public static void main(String args[]) {
    Graph g = new Graph(4);
    System.out.print(g.printBFS());
    System.out.print(g.printDFS());
  }
}
