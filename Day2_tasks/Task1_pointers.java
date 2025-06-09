package Day2;

import java.util.Arrays;

public class Task1_pointers {
    public static void main(String[] args) {
       int num[]= {8,4,14,7,2,1};
       System.out.println(Arrays.toString(num));
       int temp=0;
       for(int i=0;i<num.length;i++)
       {
    	   for(int j=0;j<num.length;j++) 
    	   {
    		   if(num[i]>num[j])
    		   {
    			   temp=num[i];
    			   num[i]=num[j];
    			   num[j]=temp;
    		   }
    	   }
       }
       System.out.println(Arrays.toString(num));
       }
       
    }
       