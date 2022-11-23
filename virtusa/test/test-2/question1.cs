using System;
using System.Collections.Generic;
public class question1
{
    public static void Main(string[] args)
    {
        string str = Console.ReadLine();
        char[] ch = str.ToCharArray();
        Stack<char> s = new Stack<char>();
        for(int i =0;i<str.Length;i++){
            if(s.Count==0){
                s.Push(str[i]);
            }else if (s.Peek()==str[i]){
                s.Pop();
            }
            else{
                s.Push(str[i]);
            }
        }
        if (s.Count==0){
            Console.Write("Balanced");
        }
        else{
            Console.Write("Not Balanced");
        }
    }
}