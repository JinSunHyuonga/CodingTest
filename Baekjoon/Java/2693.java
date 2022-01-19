import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int CountNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		StringTokenizer st;
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int number2 = Integer.parseInt(st.nextToken());
		
		int[] number = new int[10];
		
		for(int i = 0; i<CountNumber; i++)
		{
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j<number.length; j++)
			{
				number[j] = Integer.parseInt(st.nextToken());
			}			
			Arrays.sort(number);
			sb.append(number[7]+"\n");
			bw.write(sb.toString());	
			sb.setLength(0);
		}

		//sb.append(maxNum);
		//bw.write(sb.toString());
		bw.flush();			
	}
 
}
