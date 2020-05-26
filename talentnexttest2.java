1)EXTRACTING THE VOWELS 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        String str=new String();
        StringBuilder out=new StringBuilder();
        int x=0;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        if(str.contains("a")){
            out.append("a");
            x=1;
        }
        if(str.contains("e")){
            out.append("e");
            x=1;
        }
        if(str.contains("i")){
            out.append("i");
            x=1;
        }
        if(str.contains("o")){
            out.append("o");
            x=1;
        }
        if(str.contains("u")){
            out.append("u");
            x=1;
        }
        if(x==0){
            System.out.print("Thank You");
        }
        else{
            System.out.println(out);
        }
        
    }
}



2)CHARACTER ARRAY SORTING

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner (System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String s3=s1+s2;
        char[] input=s3.toCharArray();
        int i,j;
        char k;
        for(i=0;i<input.length;i++)
        {
            if(input[i]<90)
            {
                input[i]+=32;

            }
        }
for(i=0;i<input.length;i++)
{
    for(j=i+1;j<input.length;j++)
    {
        if(input[i]>input[j])
        {
            k=input[i];
            input[i]=input[j];
            input[j]=k;

        }
    }
}

k='$';
for(i=0;i<input.length;i++)
{

    if(k==input[i])
    continue;
    k=input[i];
    System.out.println(input[i]);
}


    }
}