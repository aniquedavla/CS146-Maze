package sjsu.narula.cs146.project3;

import java.util.LinkedList;

enum VertexColor {
    WHITE, GRAY, BLACK;
}

/**
 * Vertex class
 */
public class Vertex {
    boolean UP = true;
    boolean DOWN = true;
    boolean LEFT = true;
    boolean RIGHT = true;
    VertexColor color = VertexColor.WHITE;
    LinkedList<Vertex> adjList;
    String value;
    int i; // row position of the Vertex
    int j; // column position of the Vertex
    Vertex previous;
    int step;

    /**
     * Contructs the vertex
     * @param row
     * @param column
     */
    public Vertex(int row, int column) {
        this.i = row;
        this.j = column;
        this.value = "";
        adjList = new LinkedList<>();
        this.previous = null;
        this.step = -1;
    }
} // end class Vertex
