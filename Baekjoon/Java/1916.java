import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int cityCount = Integer.parseInt(br.readLine());
		int busCount = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int cityCount = Integer.parseInt(st.nextToken());		
		//int busCount = Integer.parseInt(st.nextToken());	
		
		int INF = 1000000001;
		int[][] costMap = new int[cityCount+1][cityCount+1];
		for(int i=1; i<costMap.length; i++) {
			for(int j=1; j<costMap[i].length; j++) {
				costMap[i][j] = INF;
			}
		}		
		
		StringTokenizer st;		
		
		int startCity;
		int endCity;
		int busCost;
		for (int i = 0; i < busCount; i++) {
			st = new StringTokenizer(br.readLine());
			startCity = Integer.parseInt(st.nextToken());
			endCity = Integer.parseInt(st.nextToken());
			busCost = Integer.parseInt(st.nextToken());
			if (costMap [startCity][endCity] > busCost) {
				costMap [startCity][endCity] = busCost;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		startCity = Integer.parseInt(st.nextToken());		
		endCity = Integer.parseInt(st.nextToken());	
	
		int cost[] = new int[cityCount+1];
		for (int i=1; i<cityCount+1; i++) {
			cost[i] = INF;
		}
		
		PriorityQueue<Integer> q = new PriorityQueue<>(); 
        q.offer(startCity);
        cost[startCity] = 0;
        
        int currentCity;
        while(!q.isEmpty()) {
        	currentCity = q.poll();            
            for(int i = 1; i < cost.length; i++) {
                if(i != currentCity && cost[i] > cost[currentCity] + costMap[currentCity][i]) {
                	cost[i] = cost[currentCity] + costMap[currentCity][i];
                    q.offer(i); 
                }
            }
        }	
		
		sb.append(cost[endCity]);
		bw.write(sb.toString());
		bw.flush();		
	}	
}
