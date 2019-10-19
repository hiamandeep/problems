
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    
		    int myHashMap[] =  new int[256];
		    String str = sc.next();
		    
            for(int i = 0; i < str.length(); i++){
                myHashMap[str.charAt(i)]++;
            }
		    int j;
		    for(j = 0; j < str.length(); j++){
		        if(myHashMap[str.charAt(j)] > 1){
		            //System.out.println(str.charAt(j) + " : " + myHashMap[str.charAt(j)]);
		            System.out.println(str.charAt(j));
		            break;
		        }
		    }
		    if(j == str.length()){
		        System.out.println(-1);
		    }
		}
	}
}
