package org.practise;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result  = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];
      Map<Integer, Integer> map = new HashMap<>();

      for(int i =0; i< nums.length; i++){
          int diff = target - nums[i];
          if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
          }
      }
      return result;
    }

}
