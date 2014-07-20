package tdc.java.algorithms.sorting;

import java.util.Comparator;

/**
 * @author Cuong Truong
 */
public class QuickSort {
  public static <T> void sort(T[] elements, Comparator<T> comparator) {
    if(elements == null || comparator == null) {
      return;
    }
    else if(elements.length <= 1) {
      return;
    }
    
    sortInternal(elements, comparator, 0, elements.length - 1);
  }
  
  private static <T> void sortInternal(T[] elements, Comparator<T> comparator, int startIndex, int endIndex) {
    int pivotIndex = partition(elements, comparator, startIndex, endIndex, startIndex);
    
    if(startIndex < pivotIndex) {
      sortInternal(elements, comparator, startIndex, pivotIndex - 1);
    }
    
    if(pivotIndex < endIndex) {
      sortInternal(elements, comparator, pivotIndex + 1, endIndex);
    }
  }
  
  private static <T> int partition(T[] elements, Comparator<T> comparator, int startIndex, int endIndex, int pivotIndex) {
    T pivot = elements[pivotIndex];
    swap(elements, pivotIndex, endIndex);
    
    int store = startIndex;
    
    for(int i = startIndex; i < endIndex; i++) {
      if(comparator.compare(elements[i], pivot) <= 0) {
        swap(elements, i, store);
        store++;
      }
    }
    
    swap(elements, store, endIndex);
    
    return store;
  }
  
  private static <T> void swap(T[] elements, int index1, int index2) {
    T temp = elements[index1];
    elements[index1] = elements[index2];
    elements[index2] = temp;
  }
}
