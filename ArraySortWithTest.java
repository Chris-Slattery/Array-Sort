/**
 * @(#)ArraySort.java
 *
 *
 * @author 
 * @version 1.00 2018/10/16
 */


public class ArraySortWithTest {
	
		

    public static void main(String args[]) {
    	
	    
    	char charArray[] = new char[] {'C', 'B', 'A', 'A', 'C', 'C', 'B', 'A', 'C', 'B'};
    	int start = 0;
    	int j=0, k=0, t=0, q=0;
    	final int N = 10;
    	
    	
    	//print out original array
    	System.out.println("Original Array before processing: ");
    	for(int index=0; index<charArray.length; index++){
    		System.out.println(charArray[index]);
    	}//end for
    	
    	t = N;
    	int temp;
    	
    	char temp1, temp2;
    	while(q<t){
    		if(charArray[q] == 'C'){
    			temp1 = charArray[q];
    			temp2 = charArray[k];
    			charArray[q] = temp2;
    			charArray[k] = temp1;
    			q++;
    			k++;    			
    		}//end if
    		
    		else if (charArray[q] == 'B'){
    			q = q+1;
    			  			
    			}//end else if
    			
    		else if(charArray[q] == 'A') {
    			temp1 = charArray[t-1];
    			temp2 = charArray[q];
    			charArray[q] = temp1;
    			charArray[t-1] = temp2;
    			temp = t;
    			t = temp -1;
    		}//end else if
    		j++;
    		   		
    	}//end while
    	
    	int p = 1;
    	int count = 1;
    	j = 0;
    	
    	System.out.println();
    	System.out.println("Array after processing: ");
    	
    	for(int i = 0; i<N; i++){
    		System.out.println(charArray[i]);
    		
    	}//end for
    	
    	while (k >= 0 && k <= t && t <= N){
   			if (j >= 0 && j < k) {
   				charArray[j] = 'C';
   				System.out.print("xCx");
   			} else if (j >= k && j < t) {
   				charArray[j] = 'B';
   				System.out.print("xBx");
   			} else if (j >= t && j < N) {
   				charArray[j] = 'A';
   				System.out.print("xAx");
   			}//end else if
   			System.out.println(charArray[j] + " !!!");
   			k--;
   			j++;
   			System.out.println("j k " + j + k);
   			t--;
   		}//end while
        	
    }//end main method
    
    
}//end class