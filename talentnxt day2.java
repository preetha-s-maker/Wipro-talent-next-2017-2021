1) SORT ELEMENTS BY FREQUENCY
import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;



public class Solution {

    public static void main(String args[] ) throws Exception {

        int arr[] = {1,2,8,3,2,2,2,5,1};

        int fr[];

        fr = new int[arr.length];

        int v = -1;

        for(int i = 0;i<arr.length;i++)

        {

           int count = 1;

           for(int j = i+1;j<arr.length;j++)

           {

               if(arr[i] == arr[j])

               {

                   count++;

                   fr[j] = v;

               }

           }

           if(fr[i] != v)

           {

               fr[i] = count;

           }        

        }

        for(int i = 0;i<arr.length;i++)

        {

            if(fr[i] != v)

            {

                System.out.println(" "+arr[i]+" "+fr[i]);

            }

        }



    }

}







2) ARAANGE ARRAY

import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;



public class Solution{

    static public String move(String str)

    {

        int l = str.length();

        String low = " ";

        String upr = " ";

        char c;

        for(int i=0;i<l;i++)

        {

            c = str.charAt(i);

            if(c >= 'A' && c <='Z')

            {

                upr += c;

            }

            else

            {

                low += c;

            }

        }

        return low+upr;

    }

    public static void main(String args[])

    {

        

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(move(str));

    }

}