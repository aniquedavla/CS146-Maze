# CS146 Project 3 - Maze
Keshav Narula - 009745138
Rodion Yaryy - 010915333

In this project, we implemented a "perfect" Maze, where all cells of the maze are connected. We used Depth First Search
approach to build a perfect Maze first. After building the Maze, we implemented Depth First Search (DFS) and
Breadth First Search (BFS) to solve the maze.

### How to Run the Code
Run the `GraphTest.java` file by going to:
/src/sjsu/narula/cs146/project3/GraphTest.java

Code for the `Graph` and `Vertex` class is located in `project3` package.

### Running Tests
The `GraphTest.java` class logs the following:
* perfect graph
* BFS with steps
* BFS with hash symbol
* DFS with steps
* DFS with hash symbol

### Example of the Output

------- 4x4 Graph -------
`+ +-+-+-+
`|       |
`+-+-+-+ +
`|     | |
`+-+ +-+ +
`|   |   |
`+ +-+ +-+
`|       |
`+-+-+-+ +

BFS:
`+ +-+-+-+
`|0 1 2 3|
`+-+-+-+ +
`|     |4|
`+-+ +-+ +
`|   |6 5|
`+ +-+ +-+
`|  8 7 9|
`+-+-+-+ +

`+#+-+-+-+
`|#######|
`+-+-+-+#+
`|     |#|
`+-+ +-+#+
`|   |###|
`+ +-+#+-+
`|    ###|
`+-+-+-+#+

DFS:
`+ +-+-+-+
`|0 1 2 3|
`+-+-+-+ +
`|     |4|
`+-+ +-+ +
`|   |6 5|
`+ +-+ +-+
`|    7 8|
`+-+-+-+ +

`+#+-+-+-+
`|#######|
`+-+-+-+#+
`|     |#|
`+-+ +-+#+
`|   |###|
`+ +-+#+-+
`|    ###|
`+-+-+-+#+
