import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Vertex {
  String name;
  // pointer to the first node in adjacency list
  Neighbor neighbor;

  public Vertex(String name, Neighbor neighbor) {
    this.name = name;
    this.neighbor = neighbor;
  }
}

// class to implement adjacency list nodes
class Neighbor {
  int vertexId;
  Neighbor next;

  public Neighbor(int vertexId, Neighbor next) {
    this.vertexId = vertexId;
    this.next = next;
  }
}

/**
 * Graph Data Strcuture
 */

public class Graph {
  private Vertex[] vertices;

  public Graph(Vertex[] vertices) {
    this.vertices = vertices;
  }

  public static Vertex[] loadFromFile(String filename) throws FileNotFoundException {
    Scanner in = new Scanner(new File(filename));
    String graphType = in.next();

    boolean isUndirected = graphType.equals("undirected");
    Vertex[] vertices = new Vertex[in.nextInt()];

    // initialize vertices
    for (int i = 0; i < vertices.length; i++) {
      vertices[i] = new Vertex(in.next(), null);
    }

    // initialize edges
    while (in.hasNext()) {
      int v1Id = in.nextInt();
      int v2Id = in.nextInt();

      vertices[v1Id].neighbor = new Neighbor(v2Id, vertices[v1Id].neighbor);
      if (isUndirected) vertices[v2Id].neighbor = new Neighbor(v1Id, vertices[v2Id].neighbor);
    }

    in.close();

    return vertices;
  }

  private void print() {
    Neighbor current = null;
    for (Vertex v : vertices) {
      System.out.print(v.name);
      current = v.neighbor;

      while (current != null) {
        System.out.print(" -> ");
        System.out.print(vertices[current.vertexId].name);

        current = current.next;
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Vertex[] vertices;

    System.out.println("Please enter the filename: ");
    try {
      vertices = Graph.loadFromFile(in.nextLine());
      Graph graph = new Graph(vertices);
      graph.print();
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
