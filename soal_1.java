import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class tes1{

		static void stairCase(int n){
			String str = "#";
			for(int i=1; i<=n ; i++){
				System.out.printf("%" + n + "s\n", str);
				str+="#";
			}	
		}	

		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			if((n<0) || (n>100)){
			    System.out.printf("Hanya boleh 0 sampai 100");
			}else{
			    stairCase(n);   
			}
			in.close();
		}	
}
	
