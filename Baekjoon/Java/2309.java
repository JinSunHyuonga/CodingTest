import java.io.*;
import java.util.*;
 
public class Main {

		public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int CountNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int count = Integer.parseInt(st.nextToken());		
						
		int[] heightArr = new int[9];
		int heighSum = 0;
		int exclude1 = 0;
		int exclude2 = 0;
		
		for (int i = 0; i < 9; i++)
		{			
			heightArr[i] = Integer.parseInt(br.readLine());
			heighSum += heightArr[i];
		}		
		
		heighSum -= 100;
		Arrays.sort(heightArr);
		
		for (int i = 0; i < 8; i++)
		{		
			for (int j = i+1; j < 9; j++)
			{		
				if (heightArr[i] +  heightArr[j] == heighSum)
				{
					exclude1 = i;
					exclude2 = j;
					break;
				}
			}	
		}	
		
		for (int i = 0; i < 9; i++)
		{		
			if (i == exclude1 || i == exclude2)
			{
				continue;
			}
			sb.append(heightArr[i]+"\n");
		}	
		
		//sb.append(maxNum);
		bw.write(sb.toString());
		bw.flush();			
	}
}
