1)FIND THE FACTOR


import java.io.*;

public class Factors{
    public static void main(String[] args)
{
    int number;
    Scanner sc = new sanner(system.in);
    number = sc.nextInt();
  for(int i = 1; i <= number; ++i)
    {
        if (number % i ==0)
        {
            System.out.println(i + " ");
        }
    }
}
}

2) FIZZBUZZ


import java.util.*; 
class FizzBuzz 
{ 
    public static void main(String args[]) 
    {  
        int n; 
   Scanner sc = new sanner(system.in);
    number = sc.nextInt();
     for (int i=1; i<=n; i++)                                  
        { 
            if (i%15==0)                                                  
                System.out.print("FizzBuzz"+" ");  
           else if (i%5==0)      
                System.out.print("Buzz"+" ");  
           else if (i%3==0)      
                System.out.print("Fizz"+" ");  
  
           else 
                System.out.print(i+" ");                          
        } 
    } 
} 