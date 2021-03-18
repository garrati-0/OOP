package enrico.classes;

public class DemoPoint {
    public static void main(String[] args) {
        Point p=new Point(2,4);
        System.out.println(p.x);

        p.setX(24);//setter
        System.out.println(p.getX());//getters

        System.out.println(p.toString());//toString
    }
}
