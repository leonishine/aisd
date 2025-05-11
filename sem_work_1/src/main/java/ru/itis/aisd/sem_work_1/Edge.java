package ru.itis.aisd.sem_work_1;

public class Edge implements Comparable<Edge>{
    private int from;
    private int to;
    private int weight;

    public Edge (int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getWeight() {
        return weight;
    }
}
