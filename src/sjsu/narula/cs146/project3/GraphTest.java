package src.sjsu.narula.cs146.project3;

import static org.junit.Assert.*;

/**
 * Created by narulakeshav on 12/4/16.
 */
public class GraphTest {

    @org.junit.Test
    public void graph1x1() {
        System.out.println("\n\n------- 4x4 Graph -------");
        Graph graph = new Graph(1);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph5x5() {
        System.out.println("\n\n------- 4x4 Graph -------");
        Graph graph = new Graph(5);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }


    @org.junit.Test
    public void graph10x10() {
        System.out.println("\n\n------- 8x8 Graph -------");
        Graph graph = new Graph(10);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph15x15() {
        System.out.println("\n\n------ 10x10 Graph ------");
        Graph graph = new Graph(15);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph20x20() {
        System.out.println("\n\n------ 16x16 Graph ------");
        Graph graph = new Graph(20);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph25x25() {
        System.out.println("\n\n------ 20x20 Graph ------");
        Graph graph = new Graph(25);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph30x30() {
        System.out.println("\n\n------ 25x25 Graph ------");
        Graph graph = new Graph(30);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph35x35() {
        System.out.println("\n\n------ 30x30 Graph ------");
        Graph graph = new Graph(35);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph40x40() {
        System.out.println("\n\n------ 40x40 Graph ------");
        Graph graph = new Graph(40);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph45x45() {
        System.out.println("\n\n------ 50x50 Graph ------");
        Graph graph = new Graph(45);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph50x50() {
        System.out.println("\n\n------ 100x100 Graph ------");
        Graph graph = new Graph(50);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }
}