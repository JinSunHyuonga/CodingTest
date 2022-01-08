import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int CountNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int count = Integer.parseInt(st.nextToken());		
						
		int nowNum = 0;
		int previousNum = 0;
		int previousNum2 = 1;
		
		for (int i = 1; i < CountNumber; i++)
		{			
			nowNum = previousNum + previousNum2;			
			previousNum = previousNum2;
			previousNum2 = nowNum;
		}		
		
		if(CountNumber == 1)
		{sb.append("1");}		
		else
		{sb.append(nowNum);}
		
		//sb.append(maxNum);
		bw.write(sb.toString());
		bw.flush();			
	} 
}
