1)Array accepting 25 elements



import java.util.Scanner;

public class Array

{

    public static void main(String[] args) 

    {

        int n,;

        Scanner s = new Scanner(System.in);

        int arr[] = new int[n];

        System.out.println("enter all the 25 elements:");

        for(int i = 0; i < 25; i++)

        {

            a[i] = s.nextInt();

         }

        int max = a[0];

         for(int i = 0; i < 25; i++)

        {

		if(a[i] > max[i])

		{

			max = a[i];

		}

	

        }

        System.out.println("Greatest element in the array is : "+max);

    }

}





2)Greatest element in an array and no of times it occurs :



import java.util.Scanner;

public class Maximumoccurance

{

    public static void main(String[] args) 

    {

        int n,count=0;

        Scanner s = new Scanner(System.in);

        int a[] = new int[n];

        System.out.println("Enter the 10 elements:");

        for(int i = 0; i < 10; i++)

        {

            a[i] = s.nextInt();

         }

        int max = a[0];

         for(int i = 0; i < 10; i++)

        {

		if(a[i] > max[i])

		{

			max = a[i];

		}

	

        }

        for(int i = 0; i < 10; i++)

        {

	if(max[i] == a[i])

	{

		count = count++;

 	}

        }

       System.out.println("Greatest element in the array is : "+max+"and it occurs " + count + "times");

    }

}



3)Factorial of a number



import java.util.*;

import java.io.*;

public class Factorial

{

	public static void main(String[] args) {

	   Scanner in = new Scanner (System.in);

	   int n;

	   int i, f=1;;

	   n=in.nextInt ();

	   for (i=2;i<=n;i++)

	        f*=i;

	   System.out.println ("Factorial is "+ f);

	}	   

}



4)Removing characters from the string which appear more than once



import java.util.*;

import java.io.*;

public class Repeatedcharacters

{

	public static void main(String[] args) {

	   Scanner in = new Scanner (System.in);

	   String input = new String ();

	   List<Character> op = new ArrayList<Character>();

	   input = in.nextLine ();

	   int i,j;

	   int len = input.length ();

	   for (i=0;i<len;i++)

	   {

	       char a=input.charAt(i);

	       for (j=i+1;j<len;j++)

	       {

	           char b=input.charAt(j);

	           if (a == b)

	           {

	               if (op.contains (a))

	               {

	                   continue;

	               }

	               else

	               {

	                op.add (a);

	               } 

	           }

	           else

	                if (!(op.contains (a)))

	                    op.add (a);

	       }

	   }

	   String outp= new String();

	   int leng = outp.length();

	   System.out.println (leng);

	   for (char x : op)

	   {

	       if (!(leng>0))

	       {

	            outp=Character.toString (x);

	            leng++;

	       }

	       else

	       {

	           outp=(outp.concat (Character.toString (x)));

	       }

	       

	   }

	   System.out.println (outp);

	   }

}



5)Least perfect square which is divisible by each 21 & 66



import java.io.*;

import java.util.*;

import java.lang.*;

public class Leastperfalg

{

    public static double lcm (double a,double b)

    {

        double start;

        double flag=0;

        double i=1;

        double x=1;

        if (a<b)

            start = b;

        else

            start = a;

        while (flag==0)

        {

             x=a*i;

            if (x % b == 0)

            {

                flag=1;

            }

            i++;

        }

        return x;

    }

    public static boolean perf (double a)

    {

        double sq = Math.sqrt (a);

        return ((sq-Math.floor (sq))==0);

    }

    

   public static void main(String[] args) 

  {

    double a=21;

    double b=36;

    double c=66;

    double lcma,lcmf;

    lcma = lcm (a,b);

    lcmf = lcm (lcma,c);

    double i=1;

    double flag=1;

    double temp;

    while (flag==1)

    {

        temp =lcmf * i;

        if (perf (temp))

        {

            System.out.println (temp);

            flag=0;

        }

        i++;

    }

  }

}