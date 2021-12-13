import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class birstr
{  public static void main (String[] args)
   {  Scanner sc=new Scanner(System.in);
       System.out.println("enter t");
	  int T=sc.nextInt();
	  if((T>=1) && (T<=10))
	  {for(int i=1;i<=T;i++)
	  {  System.out.println("enter n");
	      String s=sc.next();
	     int count=0;
	     for(int j=0;j<s.length()-1;j++)
	     {  for(int k=j+1;k<s.length();k++)
	        {   String s1=s.substring(j,k);
	            char s2[]=s1.toCharArray();
	            Arrays.sort(s2);
	            String s3=String.valueOf(s2);
	            int cnt0=s3.indexOf('1');
	            int cnt1=s1.length()-cnt0;
	            if(cnt0==(cnt1*cnt1))
	                count++;
	        }
	     }
	        System.out.println(count);
	  }
	  }
   }
}