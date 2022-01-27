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
		int high = Integer.parseInt(st.nextToken());		
		int width = Integer.parseInt(st.nextToken());		
		
		st = new StringTokenizer(br.readLine());
		int[] widthArr = new int[width];
		for (int i=0;i<width;i++) {
			widthArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int water = 0;
		int waterSum = 0;
		int startWall= widthArr[0];
		int sumPoint = 0;
		for (int i=1;i<width;i++) {
			if (widthArr[i] >= startWall) {
				startWall = widthArr[i];
				waterSum += water;
				water = 0;
				sumPoint = i;
			} else {
				water += startWall - widthArr[i];				
			}
			
		}
		
		water = 0;
		startWall= widthArr[width-1];
		for (int i=width-2;i>0;i--) {
			if (i < sumPoint) {
				break;
			}
			if (widthArr[i] > startWall) {
				startWall = widthArr[i];
				waterSum += water;	
				water = 0;
			} else {
				water += startWall - widthArr[i];
			}
			
		}		
		
		sb.append(String.valueOf(waterSum));
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
