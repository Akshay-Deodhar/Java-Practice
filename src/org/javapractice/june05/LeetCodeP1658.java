package org.javapractice.june05;

/**
 * https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
 */

public class LeetCodeP1658 {
    // private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public int minOperations(int[] nums, int x) {
        int arrSum = 0;
        for (int i : nums) {
            arrSum += i;
        }
        if(arrSum < x) {
            return -1;
        }
        if(arrSum == x) {
            return nums.length;
        }
        int targetSum = arrSum - x;
        int start = 0, end = 0;
        int maxLen = -1_000_000;
        int sum = 0;
        while(end < nums.length) {
            // System.out.println("Added " + nums[end]);
            sum += nums[end];
            // System.out.println("New sum " + sum);
            end++;
            while(sum > targetSum && start < end) {
                // System.out.println("Subtracted " + nums[start]);
                sum -= nums[start];
                start++;
                // System.out.println("New sum " + sum);
            }
            if(sum ==  targetSum) {
                // System.out.println(maxLen + " funny " + (end - start + 1));
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
        return maxLen == -1_000_000 ? -1 : nums.length - maxLen + 1;

    }

//     public int oldMinOperations(int[] nums, int x) {
//         try {
//             int sum = Arrays.stream(nums).sum();
//             if(sum < x) {
//                 return -1;
//             }
//             if(sum == x) {
//                 return nums.length;
//             }
//             return operations(nums, 0, nums.length - 1, x);    
            
//         } finally {
//             memo.clear();
//         }
//     }

//     public int operations(int[] nums, int start, int end, int target) {
//         int key = start*nums.length + end;
//         if(memo.containsKey(key)) {
//             return memo.get(key);
//         }
//         if(target < 0) return -1;
//         if(target == 0) return 0;
//         if(start > end) return -1;
//         if(start == end) return target == nums[start] ? 1 : -1;
//         int startOps = operations(nums, start + 1, end, target - nums[start]);
//         int endOps = operations(nums, start, end - 1, target - nums[end]);
//         if(startOps == -1 && endOps == -1) {
//             memo.put(key, -1);
//             return -1;
//         }
//         if(startOps == -1) {
//             memo.put(key, 1 + endOps);
//             return 1 + endOps;
//         }
//         if(endOps == -1) {
//             memo.put(key, 1 + startOps);
//             return 1 + startOps;
//         }
//         memo.put(key, 1 + Math.min(startOps, endOps));
//         return 1 + Math.min(startOps, endOps);

//     }
}
