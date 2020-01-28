import java.io.*;
import java.util.*;
class A

{

 public static void main(String args[])

 {
/*
System.out.println(args[0]+ "technologies"+args[1]);
System.out.println("Welcome"+args[0]);
*/
int sum=0,x,y;
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);
 sum=x+y;
System.out.println(sum);
/*
int n=Integer.parseInt(args[0]);

 if(n>0)
{
 System.out.println("The given number is Positive");
}
else if(n<0)
{
  System.out.println("The given number is Negative");
}
     else
        {
            System.out.println("The given number is neither Positive nor Negative ");
}
}
}

int i,count = 0; 
		int n=Integer.parseInt(args[0]);	
		for (i = 2;i <=n/2;i++)
		{
			if(n%i == 0)
		    {
                       count++;	
		        break;
		    }	
		}
if(n<0)
{
System.out.println("Enter integer value only");
}
		else if(count == 0)
		{
			System.out.println("Given number is a Prime Number");
		}
		else
		{
		   System.out.println("Given number is Not a Prime Number");
		}
}
}

int num=Integer.parseInt(args[0]);
int  reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println("Given number is a palindrome.");
        else
            System.out.println("Given number  is not a palindrome.");
    }
}

int n, sum = 0;
      int m=Integer.parseInt(args[0]);
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println(sum);
    }
}

int n=Integer.parseInt(args[0]);
if(n>0&&n<=12)
{
switch(n)
{

case 1:if(n==1)
System.out.println("January");
case 2:if(n==2)
System.out.println("February");
case 3:if(n==3)
System.out.println("March");
case 4:if(n==4)
System.out.println("April");
case 5:if(n==5)
System.out.println("May");
case 6:if(n==6)
System.out.println("June");
case 7:if(n==7)
System.out.println("July");
case 8:if(n==8)
System.out.println("August");
case 9:if(n==9)
System.out.println("September");
case 10:if(n==10)
System.out.println("October");
case 11:if(n==11)
System.out.println("November");
case 12:if(n==12)
System.out.println("December");
}
}
else
{
System.out.println("Invalid month");
}
}
}
*/