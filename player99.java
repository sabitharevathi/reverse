package player;

import java.util.Scanner;

public class player99 {
	public static void main(String dd[]){
	String n;
	Scanner abc=new Scanner(System.in);
	System.out.println("enter the ISBE NUMBER");
	n=abc.next();
	int k=10;int sum=0;
	for(int i=0;i<n.length();i++){
		
		sum+=n.charAt(i)*k;
		k--;
		
		
	}
	 
	if(sum%11==0){
	System.out.println("NUMBER is THE ISBE NUMBER");
}
	else{
		System.out.println("not ISBE NUMBER");
	}
}}