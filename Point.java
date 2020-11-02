public class Point{
  private double x;
  private double y;

//construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

//construct a point given a point (redundant, just provides flexibility)
  public Point(Point p){
    x=p.x;
    y=p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

//return distance from this point to the other point
  public double distanceTo(Point other){
    return (Math.sqrt(Math.pow(x-other.x, 2) + Math.pow(y-other.y, 2)));
  }

//returns true when this point has the same x andy values as the other point
  public boolean equals(Point other){
    return (other != null && other.x==x && other.y==y);
  }

  public static void main(String[] args){
  }
}
