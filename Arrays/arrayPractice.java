package Arrays;
import java.lang.reflect.Array;  
//implementing getInt function using reflect.array library.

class arrayPractice{
    public static void main(String[] args){
        int array[] = {1,2,3,4,5};

        for(int i=0;i<5;i++){
            int x = Array.getInt(array,i);
            System.out.println(x + " ");
        }

        int x = Array.getInt(array, 2);
        System.out.println(x);

        array[2] = 65;
        System.out.println(array[2]);

        
    } 
}