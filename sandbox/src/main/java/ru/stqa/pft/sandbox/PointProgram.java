package ru.stqa.pft.sandbox;

/**
 * Created by Marom on 23/07/2016.
 */
public class PointProgram {

  public static void main (String[] args){
    Point p1 = new Point();
    Point p2 = new Point();
    p1.x=5;
    p1.y=2;
    p2.x=5;
    p2.y=2;

    System.out.println("Rasstoyanie mejdu tochkami = " + distance(p1,p2) );
  }

    public static double distance (Point p1,Point p2){
      double x = p2.x-p1.x;
      double y = p2.y-p1.y;
     return Math.sqrt((x*x)+(y*y));

    }

    }


