package com.ust.LP4.c1.a3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MuseumTour {
    public static class Exhibit {
        private String name;
        private int id;

        public Exhibit(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class Museum {
        private int[][] adjacencyMatrix;
        private List<Exhibit> exhibits;

        public Museum(int numberOfExhibits) {
            adjacencyMatrix = new int[numberOfExhibits][numberOfExhibits];
            exhibits = new ArrayList<>(numberOfExhibits);
        }

        public void addExhibit(Exhibit exhibit) {
            exhibits.add(exhibit);
        }

        public void addConnection(int fromId, int toId, int distance) {
            adjacencyMatrix[fromId][toId] = distance;
            adjacencyMatrix[toId][fromId] = distance;
        }

        public List<Exhibit> getExhibits() {
            return exhibits;
        }

        public int[][] getAdjacencyMatrix() {
            return adjacencyMatrix;
        }
    }
    public static class Dijkstra {
        public static int[] dijkstra(int[][] graph, int src) {
            int n = graph.length;
            int[] dist = new int[n];
            boolean[] visited = new boolean[n];

            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;

            for (int i = 0; i < n - 1; i++) {
                int u = minDistance(dist, visited);
                visited[u] = true;

                for (int v = 0; v < n; v++) {
                    if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
            return dist;
        }

        private static int minDistance(int[] dist, boolean[] visited) {
            int min = Integer.MAX_VALUE, minIndex = -1;

            for (int v = 0; v < dist.length; v++) {
                if (!visited[v] && dist[v] <= min) {
                    min = dist[v];
                    minIndex = v;
                }
            }
            return minIndex;
        }

        public static List<Integer> findShortestPath(int[][] graph, int start, List<Integer> targets) {
            int[] dist = dijkstra(graph, start);
            List<Integer> path = new ArrayList<>();
            path.add(start);
            int current = start;

            while (!targets.isEmpty()) {
                int nearest = -1;
                int nearestDist = Integer.MAX_VALUE;
                for (int target : targets) {
                    if (dist[target] < nearestDist) {
                        nearestDist = dist[target];
                        nearest = target;
                    }
                }
                path.add(nearest);
                targets.remove(Integer.valueOf(nearest));
                dist = dijkstra(graph, nearest);
                current = nearest;
            }

            path.add(start);
            return path;
        }
    }
    public static void main(String[] args) {
        Museum museum = new Museum(5);

        Exhibit e1 = new Exhibit("monet's water lilies", 0);
        Exhibit e2 = new Exhibit("michelangelo's pieta", 1);
        Exhibit e3 = new Exhibit("egyptian sarcophagi", 2);
        Exhibit e4 = new Exhibit("picasso's guernica", 3);
        Exhibit e5 = new Exhibit("van Gogh's sunflowers", 4);

        museum.addExhibit(e1);
        museum.addExhibit(e2);
        museum.addExhibit(e3);
        museum.addExhibit(e4);
        museum.addExhibit(e5);

        museum.addConnection(0, 1, 10);
        museum.addConnection(0, 2, 20);
        museum.addConnection(1, 2, 5);
        museum.addConnection(1, 3, 15);
        museum.addConnection(2, 3, 30);
        museum.addConnection(3, 4, 10);

        int[][] graph = museum.getAdjacencyMatrix();
        List<Integer> targets = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> path = Dijkstra.findShortestPath(graph, 0, targets);

        System.out.println("efficient tour sequence:");
        for (int id : path) {
            System.out.println(museum.getExhibits().get(id).getName());
        }

        int totalTourTime = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            totalTourTime += graph[path.get(i)][path.get(i + 1)];
        }
        System.out.println("total tour time: " + totalTourTime + " minutes");
    }
    /* *
     * efficient tour sequence:
     * monet's water lilies
     * michelangelo's pieta
     * egyptian sarcophagi
     * picasso's guernica
     * van Gogh's sunflowers
     * monet's water lilies
     * total tour time: 55 minutes
     * Process finished with exit code 0
     * */
}
