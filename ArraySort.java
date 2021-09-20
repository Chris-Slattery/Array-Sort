/**
 * @(#)ArraySort.java
 *
 *
 * @author 
 * @version 1.00 2018/10/16
 */


public class ArraySort {
	
		

    public static void main(String args[]) {
    	
	    
    	char charArray[] = new char[] {'C', 'B', 'A', 'A', 'C', 'C', 'B', 'A', 'C', 'B'};
    	int start = 0;
    	int j=0, k=0, t=0, q=0;
    	final int N = 10;
    	
    	
    	//print out original array
    	System.out.println("Original Array before processing: ");
    	for(int index=0; index<charArray.length; index++){
    		System.out.print(charArray[index]);
    	}//end for
    	
    	System.out.println("\n");
    	
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
    		System.out.print(charArray[i]);
    		
    	}//end for
    	
    	
    	//termination proof
    	while(k >= 0 && k <=t && t <=N){
    		
    		if(j >=0 && j < k){
    			charArray[j] = 'C';
    		}//end if
    		
    		else if(j >= k && j < t){
    			charArray[j] = 'B'; 
    				k++;  			
    		}//end else if 
    		
    		else if(j >= t && j < N){
    			charArray[j] = 'A';
    			k = k+ 2;
    			
    		}//end else if 
    		//increment j 
    		j++;
    		
    	}//edn while
    	System.out.println("\n"); 
    	
    	System.out.println("Termination Proof: ");
    	for(int i = 0; i<N; i++){
    		System.out.print(charArray[i]);
    		
    	}//end for 
    	System.out.println("\n");
    	    	
    }//end main method
    
    
}//end class