package pro;

import java.util.ArrayList;
import java.util.Scanner;

public class pro21level {
	public static void main(String js[]){
		int n;
		Scanner aaa=new Scanner(System.in);
		System.out.print("enter the size of array");
		n=aaa.nextInt();
		int ss1[]=new int[n];
		int a1[]=new int[n];System.out.print("enter the value");
	for(int i=0;i<n;i++){
		
		a1[i]=aaa.nextInt();
	}
	for(int i=0;i<n;i++){
		ss1[i]=a1[i];}
	ArrayList<Integer> s1=new ArrayList();
	ArrayList<Integer> p1=new ArrayList();
	
		int k=0,l=0;
		int count=0;int j=1;
	for(int i=0;i<=n-1;i++){
		try{
		if(count==0){
		
			if(a1[i]<ss1[j]){
			
				s1.add(a1[i]);
				s1.add(ss1[j]);
				j++;
				

			}
			else{
				count++;
			}
			}
			
			else
			{
				p1.add(a1[i]);
				j++;
				
			}
		
	
		


	}catch(Exception e){
		System.out.println("not possible");
		}

		System.out.print(s1);
	
		System.out.print(p1);
	}
	

}

}
