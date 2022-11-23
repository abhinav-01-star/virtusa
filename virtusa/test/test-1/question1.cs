using System;

namespace ConsoleApp
{
    public class question1
    {
        public static void Main(string[] args)
        {
            string s = Console.ReadLine();
            if (s.Length%2==0){
                for(int i=(s.Length/2)-1;i>-1;i--){
                    Console.Write(s[i]);
                }
                for(int i=s.Length-1;i>(s.Length/2-1);i--){
                    Console.Write(s[i]);
                }
            }
            else{
                for(int i= (s.Length-1);i>-1;i--){
                    Console.Write(s[i]);
                }
            }
        }
    }
}