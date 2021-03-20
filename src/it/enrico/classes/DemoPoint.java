package it.enrico.classes;

public class DemoPoint {
    public static void main(String[] args) {
        Point p=new Point(2,4);
        System.out.println(p.x);

        p.setX(24);//setter
        System.out.println(p.getX());//getters

        System.out.println(p.toString());//toString

        System.out.println(Point.nDimensioni);//esempio di attributo statico
        //nel quale ci posso accedere direttamente dalla classe senza passare dall' instanza
        System.out.println(p.nDimensioni);//è possibile anche passare dal instanza
    }
}
