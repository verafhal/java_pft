package ru.stqa.pft.sandbox;

/**
 * Created by Marom on 23/07/2016.
 */
public class PointProgram {

  public static void main (String[] args){
    Point p1 = new Point(10,20);
    Point p2 = new Point(20,40);
    p1.x=10;
    p1.y=20;
    p2.x=20;
    p2.y=40;

    System.out.println("p1 = " + p1.x + "," +p1.y);
    System.out.println("p2 = " + p2.x + "," +p2.y);
    System.out.println("Rasstoyanie mejdu tochkami ravno "+ p1.distance(p2));

  }


  }



