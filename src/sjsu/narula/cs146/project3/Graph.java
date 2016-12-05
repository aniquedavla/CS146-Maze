package src.sjsu.narula.cs146.project3;

import java.util.*;

/**
 * Graph class that creates randomized maze and solve via BFS & DFS
 */
public class Graph {

  private Random randomGen;
  private Vertex vertexList[];
  private Vertex adjMatrix[][];
  private int numberOfVertices;
  private int adjMatrixSize;

  /**
   * Constructs the Maze
   * @param dimension dimensions of the maze
   */
  public Graph(int dimension) {
    randomGen = new Random();

    vertexList = new Vertex[dimension * dimension];
    adjMatrix = new Vertex[dimension][dimension];
    numberOfVertices = 0;
    adjMatrixSize = adjMatrix.length - 1;

    for(int j=0; j < dimension; j++) // set adjacency
      for(int k=0; k < dimension; k++) // matrix to 0
        adjMatrix[j][k] = new Vertex(j, k);

    createMaze();
  }



  /**
   * Generates random number between 0 and 1
   * Method provided by professor Potika
   *
   * @return random number
   */
  public double myRandom() {
    return randomGen.nextDouble();
  }

  /**
   * Creates the maze
   */
  public void createMaze() {
    Stack<Vertex> vertexStack = new Stack<Vertex>();
    Vertex currentVertex = adjMatrix[0][0];
    int visitedVertices = 1;
    int totalVertices = vertexList.length;
    boolean lastVertex = false;

    while (visitedVertices < totalVertices) {
      List<Vertex> neighborhoodList = findNeighbors(currentVertex);
      Vertex selectedVertex = currentVertex;

      if(neighborhoodList.size() > 0 ){
        vertexStack.push(currentVertex);
        int randomValue = (int) (myRandom() * neighborhoodList.size());
        currentVertex = neighborhoodList.get(randomValue);
        breakWalls(currentVertex, selectedVertex);
        visitedVertices++;
      }
      else {
        currentVertex = vertexStack.pop();
      }
    }

    adjMatrix[0][0].UP = false;
    adjMatrix[adjMatrixSize][adjMatrixSize].DOWN = false;
  }

  /**
   * Prints out the maze with ASCII characters
   * @return String representation of maze
   */
  public String printMaze() {
    String maze = "";
    int size = adjMatrix.length;

    for (int i = 0; i < size; i++){
      maze += (i == 0) ? "+ " : "+-";
    }
    maze += "+\n";

    for (int i = 0; i < size; i++){
      maze += "|";
      for (int j = 0; j < size - 1; j++){
        maze += (adjMatrix[j][i].RIGHT) ? " |" : "  ";
      }
     maze += " |\n+";
     if (i < size - 1) {
       for (int j = 0; j < size; j++) {
         maze += (adjMatrix[j][i].DOWN) ? "-+" :" +";
       }
       maze += "\n";
     }
    }

    for (int i = 0; i < size; i++){
      maze += (!adjMatrix[i][size-1].DOWN) ? " ":"-+";
    }

    maze += "+";

    return maze;
  }

  /**
   * Find all Vertices connected to the givenVertex
   * @param givenVertex
   * @return
   */
  public List<Vertex> findNeighbors(Vertex givenVertex) {
    List<Vertex> neighborhoodList = new ArrayList<Vertex>();
    int matrixSize = adjMatrixSize;

    //Checking all Vertices in the Neighborhood and adding them to the list only if they are full.
    if (givenVertex.j < matrixSize && checkFullNeighborhood(adjMatrix[givenVertex.i][givenVertex.j + 1]))
      neighborhoodList.add(adjMatrix[givenVertex.i][givenVertex.j + 1]);

    if (givenVertex.i < matrixSize && checkFullNeighborhood(adjMatrix[givenVertex.i + 1][givenVertex.j]))
      neighborhoodList.add((adjMatrix[givenVertex.i + 1][givenVertex.j]));

    if (givenVertex.j > 0 && checkFullNeighborhood(adjMatrix[givenVertex.i][givenVertex.j - 1]))
      neighborhoodList.add((adjMatrix[givenVertex.i][givenVertex.j - 1]));

    if (givenVertex.i > 0 && checkFullNeighborhood(adjMatrix[givenVertex.i - 1][givenVertex.j]))
      neighborhoodList.add((adjMatrix[givenVertex.i - 1][givenVertex.j]));

    return neighborhoodList;
  }


  public boolean checkFullNeighborhood(Vertex givenVertex) {
    return givenVertex.UP && givenVertex.DOWN && givenVertex.LEFT && givenVertex.RIGHT;
  }

  public void breakWalls(Vertex v1, Vertex v2) {
    int matrixSize = adjMatrixSize;

    if (v1.i < matrixSize && adjMatrix[v1.i + 1][v1.j].equals(v2)){
      v1.RIGHT = false;
      v2.LEFT = false;
    }

    if (v1.j < matrixSize && adjMatrix[v1.i][v1.j + 1].equals(v2)){
      v1.DOWN = false;
      v2.UP = false;
    }

    if (v1.i > 0 && adjMatrix[v1.i - 1][v1.j].equals(v2)) {
      v1.LEFT = false;
      v2.RIGHT = false;
    }

    if (v1.j > 0 && adjMatrix[v1.i][v1.j - 1].equals(v2)){
      v1.UP = false;
      v2.DOWN = false;
    }
  }



  /**
   * Prints the Breadth-first Search maze
   *
   * @return maze
   */
  public String printBFS() {
    return null;
  }

  /**
   * Prints Depth-first Search maze
   *
   * @return maze
   */
  public String printDFS() {
    return null;
  }
}
