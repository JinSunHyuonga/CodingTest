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
		int number = Integer.parseInt(st.nextToken());		
		int number2 = Integer.parseInt(st.nextToken());		
						
		int maxNum = 0;
		int minNum = 0;		
		int tempNum = 0;
		
		if (number < number2)
		{
			tempNum = number;
			number = number2;
			number2 = tempNum;
		}
		
		int divisionNum = number2;
		int remainder = number;
		if (number % divisionNum != 0)
		{
			remainder = number % divisionNum;
		}				

		while(remainder != 0)
		{
			tempNum = divisionNum % remainder;
			divisionNum = remainder;
			remainder = tempNum;					
		}	
		
		minNum = divisionNum;
		maxNum = (number*number2)/minNum;
		
		sb.append(minNum+"\n");
		sb.append(maxNum);
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
