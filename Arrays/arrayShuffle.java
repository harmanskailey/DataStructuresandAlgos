package Arrays;
/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

EXAMPLE
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

public class arrayShuffle {

    public static void main(String[] args){
        int[] input = {2,5,1,3,4,7};
        int n = 3;

        int[] res = new int[2 * n];

        for (int i1 = 0, j1 = n, idx = 0; idx < res.length; i1++, j1++) {
            res[idx++] = input[i1];
            res[idx++] = input[j1];
        }
        
        for(int i = 0;i<input.length;i++)
          System.out.print(res[i] + " ");
    }
    
}
