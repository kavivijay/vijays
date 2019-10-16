package firstproject;
import java.io.DataInputStream;
public class ClasFirst {
public static  void main(String[] args) {
		
	ClasFirst f = new ClasFirst();
		f.findFibonnaci(5);
	}
	
	public void findFibonnaci(int limit) {
		int  fibonnaciIs [] = new int[limit] ;
		for(int i=0; i<limit; i++) {
			
			if(i==0)
				fibonnaciIs[i] = 0;
			else if(i==1)
				fibonnaciIs[i]= 1;
			else 
				fibonnaciIs[i] = fibonnaciIs[i-2] + fibonnaciIs[i-1];
		}
		
		System.out.println("The fibonnaci series for the limit " + limit + "is");
		for(int i=0; i<limit; i++) {
			System.out.println(fibonnaciIs[i]);
		}
			
		}
	

}
