package player;

import java.util.Scanner;

public class player98 {
	public static void main(String dd[]){
		int n;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=abc.nextInt(); 
		System.out.println("enter the value");
		long a[]=new long[n];
		for(int i=0;i<=n-1;i++){
			a[i]=abc.nextInt();
		}
		int count=0;
		for(int k=0;k<=4-1;k++){
			char s=(char) a[k];
					if((s>0)&&(s<10000)){
						
						count++;
				
	}
		}
		if(count==4){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
}}
