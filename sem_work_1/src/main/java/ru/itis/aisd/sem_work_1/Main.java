package ru.itis.aisd.sem_work_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "";
        //PrintWriter writer = new PrintWriter(new FileWriter("kruskal_result.txt"));
        for (int i = 0; i < 100; i++) {
            fileName = "kruskal_tests/kruskal_test" + i + ".txt";
            try (Scanner sc = new Scanner(new File(fileName))) {
                int v = sc.nextInt();
                int e = sc.nextInt();
                List<Edge> edges = new ArrayList<>();

                for (int j = 0; j < e; j++) {
                    edges.add(new Edge(
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.nextInt()
                    ));
                }

                List<Edge> result = Kruskal.kruskal(edges,v);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("finished");
    }
}
