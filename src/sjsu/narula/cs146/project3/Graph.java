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

  /**
   * Constructs the Maze
   * @param dimension dimensions of the maze
   */
  public Graph(int dimension) {
    randomGen = new java.util.Random(0);

    vertexList = new Vertex[dimension * dimension];
    adjMatrix = new Vertex[dimension][dimension];
    numberOfVertices = 0;

    for(int j=0; j < dimension; j++) // set adjacency
      for(int k=0; k < dimension; k++) // matrix to 0
        adjMatrix[j][k] = new Vertex(j, k);

    adjMatrix[0][0].UP = false;
    adjMatrix[dimension-1][dimension-1].DOWN = false;
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

  }

  /**
   * Prints out the maze with ASCII characters
   *
   * @return maze
   */
  public String printMaze() {
    String maze = "+";
    int size = adjMatrix.length;

    for (int i = 0; i < size; i++){
      maze += (!adjMatrix[i][i].UP) ? " " : "+-";
    }
    maze += "+\n";

    for (int i = 0; i < size; i++){
      maze += "|";
      for (int j = 0; j < size - 1; j++){
        maze += (adjMatrix[j][i].LEFT) ? " |" : "  ";
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
