# reverse
import java.util.Scanner;


public class palindrome {
	public static void main(String o[])
	{
String input1;

Scanner abc=new Scanner(System.in);
input1=abc.nextLine();
StringBuffer br=new StringBuffer(input1);

br.reverse();
String k=new String(br);
System.out.print(br);}
}
