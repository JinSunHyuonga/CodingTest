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
						
		int nowNum = 0;
		int maxNum = 0;
		
		for (int i = 0; i < 10; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			nowNum = nowNum - Integer.parseInt(st.nextToken());
			nowNum = nowNum + Integer.parseInt(st.nextToken());
			
			if (maxNum<nowNum)
			{
				maxNum = nowNum;
			}
			
		}		
		
		sb.append(maxNum);
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
