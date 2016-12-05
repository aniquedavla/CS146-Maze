package sjsu.narula.cs146.project3;

import static org.junit.Assert.*;

/**
 * Tests the Maze
 */
public class GraphTest {

    // 1x1 Graph
    @org.junit.Test
    public void graph1x1() {
        System.out.println("\n\n------- 1x1 Graph -------");
        Graph graph = new Graph(1);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 4x4 Graph
    @org.junit.Test
    public void graph4x4() {
        System.out.println("\n\n------- 4x4 Graph -------");
        Graph graph = new Graph(4);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 5x5 Maze
    @org.junit.Test
    public void graph5x5() {
        System.out.println("\n\n------- 5x5 Graph -------");
        Graph graph = new Graph(5);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 7x7 Maze
    @org.junit.Test
    public void graph7x7() {
        System.out.println("\n\n------- 7x7 Graph -------");
        Graph graph = new Graph(5);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 10x10 Maze
    @org.junit.Test
    public void graph10x10() {
        System.out.println("\n\n------- 10x10 Graph -------");
        Graph graph = new Graph(10);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    // 15x15 Maze
    @org.junit.Test
    public void graph15x15() {
        System.out.println("\n\n------ 15x15 Graph ------");
        Graph graph = new Graph(15);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 16x16 Maze
    @org.junit.Test
    public void graph16x16() {
        System.out.println("\n\n------ 16x16 Graph ------");
        Graph graph = new Graph(16);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 20x20 Maze
    @org.junit.Test
    public void graph20x20() {
        System.out.println("\n\n------ 20x20 Graph ------");
        Graph graph = new Graph(20);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 25x25 Maze
    @org.junit.Test
    public void graph25x25() {
        System.out.println("\n\n------ 25x25 Graph ------");
        Graph graph = new Graph(25);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 30x30 Maze
    @org.junit.Test
    public void graph30x30() {
        System.out.println("\n\n------ 30x30 Graph ------");
        Graph graph = new Graph(30);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 40x40 Maze
    @org.junit.Test
    public void graph40x40() {
        System.out.println("\n\n------ 40x40 Graph ------");
        Graph graph = new Graph(40);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

    // 50x50 Maze
    @org.junit.Test
    public void graph50x50() {
        System.out.println("\n\n------ 50x50 Graph ------");
        Graph graph = new Graph(50);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
        assertEquals(graph.printBFS(), graph.printDFS());
    }

}