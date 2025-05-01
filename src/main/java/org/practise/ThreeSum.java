package org.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
     for(List<Integer> list : result) {
            for(Integer i : list) {
                System.out.print(i + " ");
            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        //{-4,-1,-1,0,1,2}

        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            } // Skip duplicates for i
            int low = i + 1;
            int high = nums.length - 1;

            findSums(nums, i, low, high, resultList);

        }

        return resultList;
    }

    private static void findSums(int[] nums, int i, int low, int high, List<List<Integer>> resultList) {
        while(low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            if(sum == 0) {
                resultList.add(List.of(new Integer[]{nums[i], nums[low], nums[high]}));
                low++;
                high--;
                while(low < high && nums[low] == nums[low - 1]) {
                    low++;
                }
                while(low < high && nums[high] == nums[high + 1]) {
                    high--;
                }
            } else if (sum < 0) {
                low++;
            } else {
                high--;
            }
        }
    }
}
