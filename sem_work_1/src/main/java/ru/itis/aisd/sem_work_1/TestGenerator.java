package ru.itis.aisd.sem_work_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestGenerator {
    public static void main(String[] args) {

        String dir = "kruskal_tests";
        new File(dir).mkdirs();
        Random random = new Random();
        int v = 0;
        for (int i = 0; i < 100; i++) {
            String fileName = dir + "/kruskal_test" + i + ".txt";
            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
                v += 5;
                int e = random.nextInt(v*(v-1)/4) + v;
                //создаю не слишком плотный и не слищком разреженный граф

                List<Edge> edges = new ArrayList<>();
                for (int j = 1; j < v; j++) {
                    int from = random.nextInt(j);
                    int weight = random.nextInt(100);
                    edges.add(new Edge(from, j, weight));
                }

                while (edges.size() < e) {
                    int from = random.nextInt(v);
                    int to = random.nextInt(v);
                    int weight = random.nextInt(100);
                    if (from != to) {
                        edges.add(new Edge(from, to, weight));
                    }
                }

                writer.println(v + " " + edges.size());
                for (Edge edge : edges) {
                    writer.println(edge.getFrom() + " " + edge.getTo() + " " + edge.getWeight());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("finished");
    }
}
