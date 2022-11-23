using System;

public class question2 {

	public static int getMinDiff(int[] arr, int n, int k)
	{

		Array.Sort(arr);
		int ans= (arr[n - 1] + k)- (arr[0]+ k);

		int tempmax= arr[n - 1] - k;
		int tempmin = arr[0] + k;
		int max, min;

		for (int i = 0; i < n - 1; i++) {
			if (tempmax > (arr[i] + k)) {
				max = tempmax;
			}
			else {
				max = arr[i] + k;
			}

			if (tempmin < (arr[i + 1] - k)) {
				min = tempmin;
			}
			else {
				min = arr[i + 1] - k;
			}

			if (ans > (max - min)) {
				ans = max - min;
			}
		}
		return ans;
	}

	public static void Main()
	{
        string[] s = Console.ReadLine().Split(' ');
        int n = int.Parse(s[0]);
        int k = int.Parse(s[1]);
        s = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(s,int.Parse);
		Console.Write(getMinDiff(arr,n,k));
	}
}
