package tdc.java.algorithms.common;

import java.util.Comparator;

/**
 * @author Cuong Truong
 */
public class Comparators {
  /**
   * Comparator for {@link Integer}
   * @author Cuong Truong
   */
  public static class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer left, Integer right) {
      if(left.intValue() < right.intValue()) {
        return -1;
      }
      else if(left.intValue() > right.intValue()) {
        return 1;
      }
      else {
        return 0;
      }
    }
  }
  
  public static final Comparator<Integer> INTEGER_COMPARATOR = new IntegerComparator();
}
