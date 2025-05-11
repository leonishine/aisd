package ru.itis.aisd.sem_work_1;

import java.util.ArrayList;
import java.util.List;

public class Kruskal {

    private static long numOfIterations;

    public static List<Edge> kruskal(List<Edge> edges, int numOfVert) {
        long start = System.nanoTime();
        numOfIterations = 0;
        //Сортировка рёбер по весу. Использую сортировку слиянием.
        mergeSort(edges);

        DSU dsu = new DSU(numOfVert);
        List<Edge> result = new ArrayList<>();

        for (Edge edge : edges) {
            numOfIterations++;
            if (dsu.union(edge.getFrom(), edge.getTo())) {
                result.add(edge);
            }
        }
        long end = System.nanoTime();
        System.out.println(edges.size() + " " + numOfVert + " " + (end - start) + " " + numOfIterations);

        return result;
    }

    // Сортировка слиянием
    private static List<Edge> mergeSort(List<Edge> edges) {
        if (edges.size() <= 1) {
            return edges;
        }
        int mid = edges.size() / 2;
        List<Edge> left = mergeSort(edges.subList(0, mid));
        List<Edge> right = mergeSort(edges.subList(mid, edges.size()));
        return merge(left, right);
    }

    private static List<Edge> merge(List<Edge> left, List<Edge> right) {
        List<Edge> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            numOfIterations++;
            if (left.get(i).getWeight() <= right.get(j).getWeight()) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        while (i < left.size()) {
            merged.add(left.get(i++));
        }
        while (j < right.size()) {
            merged.add(right.get(j++));
        }
        return merged;
    }
}