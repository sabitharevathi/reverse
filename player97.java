package player;

import java.util.Scanner;

public class player97 {
	public static void main(String dd[]){
		int n,sum=0;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the range");
		n=abc.nextInt(); 
		for(int i=1;i<=n;i++){
		
			if(i%2!=0){
				 
				sum+=i;
			}
		}
		System.out.println("output="+sum);}
}
