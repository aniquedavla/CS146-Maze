package sjsu.narula.cs146.project3;

import java.util.*;

/**
 * Graph class that creates randomized maze and solve via BFS & DFS
 */
public class Graph {

  private Random randomGen;
  private Vertex vertexList[];
  private Vertex adjMatrix[][];
  private int adjMatrixSize;

  /**
   * Constructs the Maze
   * @param dimension dimensions of the maze
   */
  public Graph(int dimension) {
    randomGen = new Random();

    vertexList = new Vertex[dimension * dimension];
    adjMatrix = new Vertex[dimension][dimension];
    adjMatrixSize = adjMatrix.length - 1;

    int count = 0;

    for(int j=0; j < dimension; j++) // set adjacency
      for(int k=0; k < dimension; k++) { // matrix to 0
        Vertex vertex = new Vertex(j, k);
        adjMatrix[j][k] = vertex;
        vertexList[count] = vertex;
        count++;
      }

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
   * Breaks necessary walls
   * Connects all of the vertices together
   */
  public void createMaze() {
    Stack<Vertex> vertexStack = new Stack<Vertex>();
    Vertex currentVertex = adjMatrix[0][0];
    int visitedVertices = 1;
    int totalVertices = vertexList.length;

    while (visitedVertices < totalVertices) {
      List<Vertex> neighborhoodList = findNeighbors(currentVertex);
      Vertex selectedVertex = currentVertex;

      if(neighborhoodList.size() > 0 ){
        vertexStack.push(currentVertex);
        int randomValue = (int) (myRandom() * neighborhoodList.size());
        currentVertex = neighborhoodList.get(randomValue);
        breakWalls(currentVertex, selectedVertex);
        currentVertex.adjList.add(selectedVertex);
        selectedVertex.adjList.add(currentVertex);
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
        maze += (adjMatrix[j][i].step > -1) ? adjMatrix[j][i].step % 10 : " ";
        maze += (adjMatrix[j][i].RIGHT) ?  "|" : " ";
      }
     maze += (adjMatrix[size - 1][i].step > -1) ? adjMatrix[size-1][i].step % 10 + "|\n+" : " |\n+";
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


  public String solveMaze() {
    String maze = "";
    int size = adjMatrix.length;

    for (int i = 0; i < size; i++){
      maze += (i == 0) ? "+#" : "+-";
    }
    maze += "+\n";

    for (int i = 0; i < size; i++){
      maze += "|";
      for (int j = 0; j < size - 1; j++){
        if (adjMatrix[j][i].RIGHT)
          maze += (adjMatrix[j][i].value.equals("#")) ? "#|" : " |";
        else {
          if (adjMatrix[j][i].value.equals("#")) {
            maze += "#";
            maze += (adjMatrix[j + 1][i].value.equals("#")) ? "#" : " ";
          }
          else
            maze += "  ";
        }
      }

      maze += adjMatrix[size - 1][i].value.equals("#") ? "#|\n+" : " |\n+";
      if (i < size - 1) {
        for (int j = 0; j < size; j++) {
          if (adjMatrix[j][i].DOWN)
            maze += "-";
          else
            maze += (adjMatrix[j][i].value.equals("#")) ? "#" :" ";
          maze += "+";
        }
        maze += "\n";
      }
    }

    for (int i = 0; i < size; i++){
      maze += (!adjMatrix[i][size-1].DOWN) ? "#":"-+";
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
    // reset the vertices in the main maze
    Vertex currentVertex = vertexList[0];
    Queue<Vertex> verticesQueue = new LinkedList<Vertex>();
    verticesQueue.add(currentVertex);
    int step = 0;

    while(!verticesQueue.isEmpty() && !currentVertex.equals(vertexList[vertexList.length - 1])){
      currentVertex = verticesQueue.remove();
      currentVertex.color = VertexColor.BLACK;
      currentVertex.step = step;
      step++;
      for (Vertex vertex : currentVertex.adjList){
        if (vertex.color == VertexColor.WHITE){
          vertex.color = VertexColor.GRAY;
          vertex.previous = currentVertex;
          verticesQueue.add(vertex);
        }
      }
    }

    while(currentVertex != vertexList[0]) {
      currentVertex.value = "#";
      currentVertex = currentVertex.previous;
    }
    currentVertex.value = "#";
    System.out.println(printMaze());

    System.out.println("\n\nBFS:");
    return solveMaze();
  }

  /**
   * Prints Depth-first Search maze
   *
   * @return maze
   */
  public String printDFS() {
    // reset vertices
    Vertex currentVertex = vertexList[0];
    Queue<Vertex> verticesQueue = new LinkedList<>();
    verticesQueue.add(currentVertex);
    int step = 0;
    while (!verticesQueue.isEmpty() && !currentVertex.equals(vertexList[vertexList.length - 1])) {
      currentVertex = verticesQueue.remove();
      currentVertex.color = VertexColor.BLACK;
      currentVertex.step = step;
      step++;
      for (Vertex v: currentVertex.adjList) {
        if (v.color == VertexColor.WHITE) {
          v.color = VertexColor.GRAY;
          v.previous = currentVertex;
          verticesQueue.add(v);
        }
      }
    }

    while(currentVertex != vertexList[0]) {
      currentVertex.value = "#";
      currentVertex = currentVertex.previous;
    }
    currentVertex.value = "#";
    System.out.println("\n\nDFS:");
    return solveMaze();
  }
}
