package pro;

import java.util.Scanner;

public class deleting2 {
	public static void main(String dd[]){
		String n;
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the  NUMBER");
		n=abc.next();
	char a[]=new char[n.length()];
	int k1=0;
	for(int i=0;i<=n.length()-1;i++){
		a[k1]=n.charAt(i);
		k1++;
	}
	for(int j=0;j<=n.length()-1;j++)
	{
		for(int k=j+1;k<=n.length()-1;k++)
		{
			if(a[j]>a[k]){
				char tmp=a[j];
	
				a[j]=a[k];
				a[k]=tmp;
				}

}
}System.out.println("Enter the number to be deleted");
int s=abc.nextInt();
String sum="";
	for(int j=0;j<=n.length()-1-s;j++){
		sum+=a[j];
	
}System.out.println("latest number="+sum);

	}
}