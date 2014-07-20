package tdc.java.algorithms.sorting;

import java.util.Comparator;

/**
 * @author Cuong Truong
 */
public class InsertionSort {
  public static <T> void sort(T[] elements, Comparator<T> comparator) {
    if(elements == null || comparator == null) {
      return;
    }
    
    if(elements.length <= 1) {
      return;
    }
    
    for(int i = 1; i < elements.length; i++) {
      int position = i;
      T element = elements[position];
      
      while(position > 0 && comparator.compare(elements[position - 1], element) > 0) {
        //swap
        elements[position] = elements[position - 1];
        
        position -= 1;
      }
      
      elements[position] = element;
    }
  }
}
