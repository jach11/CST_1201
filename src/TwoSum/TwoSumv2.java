package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumv2 {
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index of i = " +i+", value of nums[i] = " +nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("Index of j = " +j+", value of nums[j] = " +nums[j]);
                System.out.println("Trying ("+nums[i] +" + " +nums[j] +")...");
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] +" + " +nums[j] +" = " +target);
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No solution!");
    }

    public int[] hashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Putting key of i = " +i+", with value of nums[i] = " +nums[i]);
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.println(+target +" = " +complement +" + " +nums[i]);
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No solution!");
    }

    public static void main(String[] args) {
        int[] nums = {3,5,6,9,10,15};
        int target = 15;
        TwoSumv2 answer = new TwoSumv2();
        System.out.println("The length of the array is " +nums.length);
        Scanner input = new Scanner(System.in);
        System.out.print("""
                1. Brute Force\s
                2. Hash Table\s
                Please select your method:\s""");
        String methodChoice = input.next();
        String methodAnswer;
        if (methodChoice.contentEquals("1")) {
            methodAnswer = Arrays.toString(answer.bruteForce(nums, target));
            System.out.print("Index Values: " +methodAnswer);
        } else if (methodChoice.contentEquals("2")) {
            methodAnswer = Arrays.toString(answer.hashTable(nums, target));
            System.out.print("Index Values: " +methodAnswer);
        } else System.out.print("The method you selected is not valid!");
    }
}