import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int countNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		int startNumber = Integer.parseInt(st.nextToken());
		int endNumber = Integer.parseInt(st.nextToken());
		
		int nowNumber = 1;
		int repeatNumber = 0;
		int numberSum = 0;

		for (int i = 0; i<endNumber; i++)
		{
			if(nowNumber == repeatNumber)
			{
				nowNumber++;
				repeatNumber = 1;
			}
			else
			{
				repeatNumber++;
			}
			if(i+2>startNumber)
			{
				numberSum += nowNumber;
			}
			
		}	

		sb.append(numberSum);
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
