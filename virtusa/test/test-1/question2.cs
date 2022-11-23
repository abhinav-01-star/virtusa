using System;
public class Program
{
    public static void Main(string[] args)
    {
        string s  = Console.ReadLine();
        string res = "";
        for (int i = 0;i<s.Length;i++){
            int n = s[i]-'a';
            n = (n+3)%26;
            res+= (char)(n + 'a');
        }
        Console.Write(res);
    }
}