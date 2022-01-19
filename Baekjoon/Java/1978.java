import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int countNumber = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int number2 = Integer.parseInt(st.nextToken());
		
		int countPrimeNumber = 0;
		int primeNumber = 0;

		for (int i = 0; i<countNumber; i++)
		{
			primeNumber = Integer.parseInt(st.nextToken());
			for(int j = 2; j<primeNumber+1; j++)
			{
				if(j == primeNumber)
				{
					countPrimeNumber ++;
				}		
				
				if(primeNumber % j == 0)
				{
					break;
				}
		
			}
			
		}	

		sb.append(countPrimeNumber);
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
