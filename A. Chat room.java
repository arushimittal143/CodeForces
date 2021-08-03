import java.util.*;
public class Ideone
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		char ch1[]=str1.toCharArray();
		String str2="hello";
		char ch2[]=str2.toCharArray();
		int j=0,c=0;
		for(int i=0;i<str1.length();i++)
		{
		    if(ch1[i]==ch2[j]){
		        j++;
		        c++;
		        if(c==5)
		        break;
		    }
		}
		if(c==5)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
