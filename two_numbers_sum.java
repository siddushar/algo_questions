IPs:

array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10 
OUTPUT:
[-1,11]

import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {

    HashMap map = new HashMap();

    for(int i=0; i < array.length; i++) {
      
      Integer val = targetSum-array[i];
        if( map.get(val) != null) {
          int numbers[] = {val, array[i]};
             return numbers;
        }
      map.put(array[i], i);
    }
    return new int[0];
  }
}
