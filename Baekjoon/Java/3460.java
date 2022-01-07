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
		int getNumber = 0;
		String StringBinary = "";
		int outNumber = 0;
		
		for (int i = 0; i < CountNumber; i++)
		{
			
			sb = new StringBuilder();
			getNumber = Integer.parseInt(br.readLine());
			StringBinary = Integer.toBinaryString(getNumber);

			for (int j = StringBinary.length()-1; j>=0; j--)
			{
				if (StringBinary.charAt(j) == '1') {
					sb.append(outNumber + " ");
				}		
				outNumber++;
			}		
			
			bw.write(sb.toString());
			sb.setLength(0);		
			outNumber = 0;
		}
		
		
		//sb.append(outNumber);
		//bw.write(sb.toString());
		bw.flush();			
	}
 
}
