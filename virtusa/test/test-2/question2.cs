using System;

public class Program
{
    static void permute(String s, String answer)
    {
        String left_substr = "";
        String right_substr = "";
        String rest = "";
        if (s.Length == 0) {
            Console.Write(answer + "  ");
            return;
            }
        for (int i = 0; i < s.Length; i++) {
            char ch = s[i];
            left_substr = s.Substring(0, i);
            right_substr = s.Substring(i + 1);
            rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
}
    public static void Main(string[] args)
    {
        string str = Console.ReadLine();
        string res = "";
        Console.Write("Permutations are:");
        permute(str, res);
    }
}