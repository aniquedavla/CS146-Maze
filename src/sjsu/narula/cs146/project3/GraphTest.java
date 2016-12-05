package sjsu.narula.cs146.project3;

import static org.junit.Assert.*;

/**
 * Created by narulakeshav on 12/4/16.
 */
public class GraphTest {

    @org.junit.Test
    public void graph4x4() {
        System.out.println("\n\n------- 4x4 Graph -------");
        Graph graph = new Graph(3);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    /*
    @org.junit.Test
    public void graph8x8() {
        System.out.println("\n\n------- 8x8 Graph -------");
        Graph graph = new Graph(8);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph10x10() {
        System.out.println("\n\n------ 10x10 Graph ------");
        Graph graph = new Graph(10);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph16x16() {
        System.out.println("\n\n------ 16x16 Graph ------");
        Graph graph = new Graph(16);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph20x20() {
        System.out.println("\n\n------ 20x20 Graph ------");
        Graph graph = new Graph(20);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph30x30() {
        System.out.println("\n\n------ 30x30 Graph ------");
        Graph graph = new Graph(20);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph40x40() {
        System.out.println("\n\n------ 40x40 Graph ------");
        Graph graph = new Graph(20);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    }

    @org.junit.Test
    public void graph50x50() {
        System.out.println("\n\n------ 50x50 Graph ------");
        Graph graph = new Graph(20);
        System.out.print(graph.printMaze());
        System.out.print(graph.printBFS());
        System.out.print(graph.printDFS());
    } */
}