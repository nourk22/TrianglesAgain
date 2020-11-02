public class Tester{
  public static void main(String[] args){
    Point p1 = new Point(4, 0);
    Point p2 = new Point(0, 3);
    Point p3 = new Point(0, 0);
  /*  System.out.println(p1.getX()); //expecting 4.0
    System.out.println(p1.getY()); //expecting 0.0
    System.out.println(p1.distanceTo(p2)); //expecting 5.0
    System.out.println(p1.equals(p2)); //expecting false
    System.out.println(p1.equals(p1)); //expecting true
  */

    Triangle t = new Triangle(p1, p2, p3);
    System.out.println(t.getPerimeter()); //expecting 5+4+3=12.0
    System.out.println(t.getArea()); //expecting (4*3)/2=6.0
    System.out.println(t.classify()); //expecting scalene
    System.out.println(t.toString()); //expecting v1(4.0, 0.0) v2(0.0, 3.0) v3(0.0, 0.0)
    t.setVertex(0, (new Point(6, 1)));
    t.setVertex(1, (new Point(1, 13)));
    t.setVertex(2, (new Point(1, 1)));
    System.out.println(t.getPerimeter()); //expecting 12+5+13=30.0
    System.out.println(t.getArea()); //expecting (12*5)/2=30.0
    System.out.println(t.classify()); //expecting scalene
    System.out.println(t.toString()); //expecting v1(6.0, 1.0) v2(1.0, 13.0) v3(1.0, 1.0)

  }
}
