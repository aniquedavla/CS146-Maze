package src.sjsu.narula.cs146.project3;

class Vertex {
  public char label; // label (e.g. ‘A’)
  public boolean wasVisited;

  public boolean UP = true;
  public boolean DOWN = true;
  public boolean LEFT = true;
  public boolean RIGHT = true;
  public int i; // row position of the Vertex
  public int j; // column position of the Vertex

  public Vertex(int row, int column) { // constructor
    this.i = row;
    this.j = column;
  }
} // end class Vertex
