import java.io.*;
import java.util.*;
 
public class Main {

	static int maxNumber = Integer.MIN_VALUE;
	static int minNumber = Integer.MAX_VALUE;
	static int[] number;
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int countNumber = Integer.parseInt(br.readLine());		
		//String getString = br.readLine();
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int number2 = Integer.parseInt(st.nextToken());
		
		number = new int[countNumber];
		for(int i=0;i<countNumber;i++)
		{
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());
		int multiple = Integer.parseInt(st.nextToken());
		int division = Integer.parseInt(st.nextToken());

		dfs(plus,minus,multiple,division,1,number[0]);

		sb.append(maxNumber+"\n");
		sb.append(minNumber);
		bw.write(sb.toString());
		bw.flush();			
	}
	
	public static void dfs (int plus, int minus, int multiple, int division, int numberCoun, int sum) {
		
		if (numberCoun == number.length) {
			if (maxNumber<sum) {
				maxNumber = sum;
			}
			if (minNumber>sum) {
				minNumber = sum;
			}
			return;
		}	
		
		if (plus !=0) {
			dfs(plus-1,minus,multiple,division,numberCoun+1, sum+number[numberCoun]);
		}
		if (minus !=0) {
			dfs(plus,minus-1,multiple,division,numberCoun+1, sum-number[numberCoun]);
		}
		if (multiple !=0) {
			dfs(plus,minus,multiple-1,division,numberCoun+1, sum*number[numberCoun]);
		}
		if (division !=0) {
			dfs(plus,minus,multiple,division-1,numberCoun+1, sum/number[numberCoun]);
		}
			

	}
 
}
