package sjsu.narula.cs146.project3;

import java.util.*;

/**
 * Graph class that creates randomized maze and solve via BFS & DFS
 */
public class Graph {
    private Random randomGen; // creates random maze

    /**
     * Constructs the Maz
     * @param dimension dimensions of the maze
     */
    public Graph(int dimension) {
        randomGen = new java.util.Random(0); // idk what this does LOL
    }

    /**
     * Generates random number between 0 and 1
     * Method provided by professor Potika
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
     * @return maze
     */
    public String printMaze() {
        return null;
    }

    /**
     * Prints the Breadth-first Search maze
     * @return maze
     */
    public String printBFS() {
        return null;
    }

    /**
     * Prints Depth-first Search maze
     * @return maze
     */
    public String printDFS() {
        return null;
    }
}
