package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    private static final int MIN_VALIDITY = -109;
    private static final int MAX_VALIDITY = 1_000_000_000;
    private static final int MAX_LENGTH = 10_000;

    public static int[] twoSum(int[] nums, int target) {

        if(isInvalid(target)){
            System.out.println("Invalid target number");
            return new int[0];
        }

        if(nums.length<2||nums.length>MAX_LENGTH){
            System.out.println("Invalid nums length");
            return new int[0];
        }

        if(isInvalid(nums[0])){
            System.out.println("Invalid value on nums");
            return new int[0];
        }


        boolean solutionFound = false;
        int[] solution = new int[0];


        for(int i = 0; i< nums.length; i++){
            for(int j = 1; j< nums.length; j++){
                if(isInvalid(nums[j]) && i==0){
                    System.out.println("Invalid value on nums");
                    return new int[0];
                }

                if((nums[i]+nums[j])==target && !solutionFound){
                    solution = new int[]{i, j};
                    solutionFound = true;

                } else if((nums[i]+nums[j])==target){
                    System.out.println("More than one solution");
                    return new int[0];
                }
            }
        }

        return solution;
    }

    public static boolean isInvalid(int value) {
        return value < MIN_VALIDITY || value > MAX_VALIDITY;
    }

}
