package tdc.java.algorithms.sorting;

import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Cuong Truong
 */
public class TestInsertionSort {
  @Test
  public void testSort() {
    Integer[] elements = new Integer[] { 3, 2, 4, 1, 2, 1, 1, 9, 6, 7, 0, -3, 11, 10, 10 };
    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer e1, Integer e2) {
        if(e1.intValue() < e2.intValue()) {
          return -1;
        }
        else if(e1.intValue() > e2.intValue()) {
          return 1;
        }
        else return 0;
      }
    };
    
    InsertionSort.sort(elements, comparator);
    
    for(int i = 0; i < (elements.length - 1); i++) {
      Assert.assertTrue(comparator.compare(elements[i], elements[i + 1]) <= 0);
    }
  }
}
