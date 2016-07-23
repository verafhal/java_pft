package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Marom on 23/07/2016.
 */
public class SquareTests {

@Test
  public void testArea() {
    Square s = new Square(5);
  Assert.assertEquals(s.area(), 25.0);

  }
}