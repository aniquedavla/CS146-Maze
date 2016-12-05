package sjsu.narula.cs146.project3;

import java.util.LinkedList;

enum VertexColor {
  WHITE, GRAY, BLACK;
}

/**
 * Vertex class
 */
public class Vertex {
  public boolean UP = true;
  public boolean DOWN = true;
  public boolean LEFT = true;
  public boolean RIGHT = true;
  public VertexColor color = VertexColor.WHITE;
  public LinkedList<Vertex> adjList;
  public String value;
  public int i; // row position of the Vertex
  public int j; // column position of the Vertex
  public Vertex previous;
  public int step;

  public Vertex(int row, int column) { // constructor
    this.i = row;
    this.j = column;
    this.value = "";
    adjList = new LinkedList<>();
    this.previous = null;
    this.step = -1;
  }
} // end class Vertex
