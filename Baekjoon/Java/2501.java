import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int getNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());		
		int count = Integer.parseInt(st.nextToken());		
		
		int nowCount = 0;
		int outNumber =0;
		
		for (int i = 1; i < number+1; i++)
		{
			if (number % i == 0) {
				nowCount++;
			}
		
			if (count == nowCount) {
				outNumber = i;
				break;
			}
						
		}
		
		
		sb.append(outNumber);
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
