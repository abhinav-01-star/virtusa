// Program to find minimum number of platforms
// required on a railway station

using System;

public class question1 {
	public static int findPlatform(int[] arr, int[] dep,int n)
	{
		int plat_needed = 1, result = 1;
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			plat_needed = 1;

			for (j = 0; j < n; j++) {
				if (i != j)
					if (arr[i] >= arr[j]&& dep[j] >= arr[i])
						plat_needed++;
			}

			result = Math.Max(result, plat_needed);
		}

		return result;
	}


	public static void Main()
	{
        int n = Convert.ToInt32(Console.ReadLine());
		string[] s1 = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(s1,int.Parse);
		string[] s2 = Console.ReadLine().Split(' ');
        int[] dep = Array.ConvertAll(s2,int.Parse);
		Console.WriteLine(findPlatform(arr, dep, n));
	}
}
