import java.util.*;
import java.lang.*;
import java.io.*;

class Problem21
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int total = 0;
        for (int b = 2; b < 10000; b++)
        {
            
            int sumb = 0;
            int suma = 0;
            for (int i = 1; i<=((b/2)); i++)
            {
                if (b%i == 0)
                {
                    sumb = sumb + i;
                }   
             }
             if (sumb < b){
             int a = sumb;
             {
                for (int i = 1; i<=(a/2); i++)
                {
                    if (a%i == 0)
                    {
                        suma = suma + i;
                        System.out.println("test");
                    }   
                }
                if (suma == b)
                {
                    total = total + a + b;
                    System.out.println(total);
                }
             }
            }
        }
        
        System.out.println(total);
    }
    }
