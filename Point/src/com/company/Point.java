package com.company;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance = Math.sqrt((x) * (x) + (y) * (y));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return distance;
    }

    public double distance(Point point) {
        double distance = Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY()));
        return distance;
    }
}
