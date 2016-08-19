package player;

import java.util.Scanner;

public class play82 {
	public static void main(String dd[]){
		int n;
		Scanner abc=new Scanner(System.in);
		n=abc.nextInt(); 
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=abc.nextInt();
		}
		if(a.length%2==0){
			for(int i=0;i<n;i++){
				if(i==n/2){
					double k=Math.abs(a[i+1]-a[i]);
					System.out.println(i+" "+k);
					k=k/2;
					System.out.println(i+" "+k);
					System.out.println(a[i]-k);
				}
			}

		}
		else if(a.length%2!=0){
			for(int i=0;i<n;i++){
				if(i==n/2){
					System.out.println(a[i]);
				}
			}
		}
	}

}
