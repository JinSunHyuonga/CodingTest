import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int CountNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int CountNumber = Integer.parseInt(st.nextToken());		
		int minimumSum = Integer.parseInt(st.nextToken());		
	
		st = new StringTokenizer(br.readLine());
		
		int [] numberArray = new int[CountNumber];
		for (int i = 0; i < CountNumber; i++)
		{
			numberArray[i] = Integer.parseInt(st.nextToken());
		}
		
		int minimumSumCount = Integer.MAX_VALUE;
		int sumCount = 0;
		int sum = 0;
		
		for (int i = 0; i < CountNumber; i++)
		{
			sum += numberArray[i];
			sumCount++;
				
			while (sum >= minimumSum) {
				if (minimumSumCount > sumCount) {
					minimumSumCount = sumCount;
				}
				sum -= numberArray[i - (sumCount - 1)];
				sumCount--;
			}
			
		}		
		
		if (minimumSumCount == Integer.MAX_VALUE) {
			minimumSumCount = 0;
		}
		sb.append(minimumSumCount);
		bw.write(sb.toString());
		bw.flush();			
	}
	
}
