import java.util.Arrays;

/*
Two Sum II - Input Array Is Sorted

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3}, 5)));;
    }
    public static int[] twoSum(int[] numbers, int target) {

        int [] idx = new int[2];
        int i = 0, j = numbers.length - 1;

        while(i < j)
        {
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                idx[0] = i + 1;
                idx[1] = j + 1;
                break;
            }
            else if(sum < target)
                i ++;
            else
                j --;
        }

        return idx;
    }
}
