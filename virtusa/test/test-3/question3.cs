using System;
using System.Collections.Generic;
public class question {
    public static void Main() 
    {
        Console.Write("Enter the number of socks:");
        Int32 n = Convert.ToInt32(Console.ReadLine());
        Console.Write("Enter array values:");
        string[] s = Console.ReadLine().Split(' ');
        int[] a = Array.ConvertAll(s,int.Parse);
        Dictionary<int,int> d = new Dictionary<int, int>();
        int count = 0;
        foreach (var I in a)
        {
            if (!d.ContainsKey(I)){
                d.Add(I,0);
            }
            d[I]+=1;
        }
        foreach (KeyValuePair<int,int> i in d)
        {
            count+=(i.Value/2);
        }
        Console.Write("The number of pairs are:"+count);
        
    }
}