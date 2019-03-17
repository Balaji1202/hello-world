/*
This is a Java program that converts the number in numerical format to 
textual format.
Further the output from this program can be used for any automatic teller 
machine (precisely without any language api and machine learning) that pronunces numbers, I hope so. Like one I've seen something like
Token systems in Banks, food counters, etc.

Note: Used hashmap to make things pretty simpler and easier.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class numtowords
{
    public static void main(String args[])
    {
        HashMap <Integer,String>hm3=new HashMap<>();
        //hm3.put(1,"ten");
		hm3.put(1,"eleven");
        hm3.put(2,"twelve");
        hm3.put(3,"thirteen");
        hm3.put(4,"fourteen");
        hm3.put(5,"fifteen");
        hm3.put(6,"sixteen");
        hm3.put(7,"seventeen");
        hm3.put(8,"eighteen");
        hm3.put(9,"ninteen");

        HashMap <Integer,String>hm=new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");
        hm.put(6,"six");
        hm.put(7,"seven");
        hm.put(8,"eight");
        hm.put(9,"nine");
		//hm.put(0,"ten");

        HashMap <Integer,String>hm1=new HashMap<>();
        hm1.put(1,"ten");
        hm1.put(2,"twenty");
        hm1.put(3,"thirty");
        hm1.put(4,"fourty");
        hm1.put(5,"fifty");
        hm1.put(6,"sixty");
        hm1.put(7,"seventy");
        hm1.put(8,"eighty");
        hm1.put(9,"ninty");


        HashMap <Integer,String>hm4=new HashMap<>();
        hm4.put(1,"one hundred only");
        hm4.put(2,"two hundred only");
        hm4.put(3,"three hundred only");
        hm4.put(4,"four hundred only");
        hm4.put(5,"five hundred only");
        hm4.put(6,"six hundred only");
        hm4.put(7,"seven hundred only");
        hm4.put(8,"eight hundred only");
        hm4.put(9,"nine hundred only");

        HashMap <Integer,String>hm2=new HashMap<>();
        hm2.put(1,"one hundred and");
        hm2.put(2,"two hundred and");
        hm2.put(3,"three hundred and");
        hm2.put(4,"four hundred and");
        hm2.put(5,"five hundred and");
        hm2.put(6,"six hundred and");
        hm2.put(7,"seven hundred and");
        hm2.put(8,"eight hundred and");
        hm2.put(9,"nine hundred and");

        int num,rem,count=1;
        String res="";
        Scanner ob=new Scanner(System.in);
        //num=ob.nextInt();
		int numval=0;
        while(numval<1000)
		{
			num=numval;count=1;res="";rem=0;
			while(num!=0)
			{
				rem=num%10;
				num/=10;
				if(rem!=0)
				{
					if(count==1 && num%10==1)
					{
						res=" "+hm3.get(rem)+res;
						count=3;
						num/=10;
						rem=num%10;
					}
					
					if(count==1)
						res=" "+hm.get(rem)+res;
					
					else if(count==2)
						res=" "+hm1.get(rem)+res;
					
					else if(count==3)
						res=" "+hm2.get(rem)+res;
					count++;
				}
				else if(num%10==0 /*&& (num/10)%10==0*/)
				{
					res=hm4.get((num/10)%10);
					break;
				}
				else
					count++;
			System.out.println(res + "="+numval);
			}
			numval++;
		}

    }
}
