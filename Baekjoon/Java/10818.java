import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int CountNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int count = Integer.parseInt(st.nextToken());		
	
		int number = Integer.parseInt(st.nextToken());
		int minNum = number;		
		int maxNum = number;
		
		for (int i = 0; i < CountNumber-1; i++)
		{
			number = Integer.parseInt(st.nextToken());
			if (minNum>number)
			{
				minNum = number;
			}
			if (maxNum<number)
			{
				maxNum = number;
			}
			
		}
		
		
		sb.append(minNum + " ");
		sb.append(maxNum);
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
