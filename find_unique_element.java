import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
	    while(t-- > 0){
	        
	        int[] myHashMap = new int[10000];
	        
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        for(int i = 0; i < n; i++){
                int p = sc.nextInt();
                myHashMap[p]++;
	        }
	        
	        for(int i = 0; i < myHashMap.length; i++){
	            if(myHashMap[i] == 1){
	                System.out.println(i);
	            }
	        }
	    }
	}
}
