/*Given an array nums. We define a running sum of an array as 
runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.*/

package Arrays; 

class runningSumSolution{
    
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args){
        int[] input = {1,2,3,5};
        int[] result = runningSum(input);
        for(int i = 0;i<result.length;i++)
            System.out.print(result[i] + " ");
    }
}