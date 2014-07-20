package tdc.java.algorithms.sorting;

import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import tdc.java.algorithms.common.Comparators;

/**
 * @author Cuong Truong
 */
public class TestQuickSort {
  @Test
  public void testSort() {
    Integer[] elements = new Integer[] { 10, 9, 7, 6, 11, 5, 1, 3, 2, 4, 12, 0, 13 };
    Comparator<Integer> comparator = Comparators.INTEGER_COMPARATOR;
    QuickSort.sort(elements, comparator);
    
    for(int i = 0; i < (elements.length - 1); i++) {
      Assert.assertTrue(comparator.compare(elements[i], elements[i + 1]) <= 0);
    }
  }
}
