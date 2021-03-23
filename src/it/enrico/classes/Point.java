package it.enrico.classes;
import java.awt.*
public class Point {
    double x; //x e y hanno visibilità default quindi può essere visibile solo nel package
    double y;
    public static int nDimensioni = 2; //attributo statico

    public Point(double x, double y) {    //costruttore
        this.x = x;
        this.y = y;
    }

    public double getX() {      //getters
        return x;
    }

    public void setX(double x) {    //setters
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
