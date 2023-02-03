
arry = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]

O/P = true

import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int index = 0;

    for(int i=0; i < array.size(); i++) {
     if(array.get(i) == sequence.get(index)) {
       index ++;
     }

      if(index == sequence.size()){
        return true;
      }
    }
    return false;
    
  }
}


