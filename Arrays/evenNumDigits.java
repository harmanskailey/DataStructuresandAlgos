/* Given an array nums of integers, return how 
many of them contain an even number of digits. */
package Arrays;
class evenNumDigits {

    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if((i>=10 && i<100)||(i>=1000 && i<10000) || (i>=100000 && i<1000000) ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] input = {1,25,345,2345,12345,123546,120,12};
        int evendigits = findNumbers(input);
        System.out.print(evendigits);
    }

}