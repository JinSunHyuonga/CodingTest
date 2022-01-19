import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int minNumber = Integer.parseInt(br.readLine());
		int maxNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
				
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int number2 = Integer.parseInt(st.nextToken());
		
		int sumPrimeNumber = 0;
		int minprimeNumber = 10000;

		for (int i = minNumber; i<maxNumber+1; i++)
		{
			for(int j = 2; j<i+1; j++)
			{
				if(j == i)
				{
					sumPrimeNumber += i;
					if (minprimeNumber > i)
					{
						minprimeNumber = i;
					}
				}		
				
				if(i % j == 0)
				{
					break;
				}		
			}			
		}	

		if(sumPrimeNumber > 0)
		{
			sb.append(sumPrimeNumber+"\n");
			sb.append(minprimeNumber);
		}
		else
		{
			sb.append(-1);
		}
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
