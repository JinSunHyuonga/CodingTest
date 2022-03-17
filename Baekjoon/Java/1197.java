import java.io.*;
import java.util.*;

public class Main {
	
	static int[] nodeParents;
	
	public static int findParents (int node) {
		int parents;
		if (node == nodeParents[node]) {
			parents = node;
		} else {
			parents = findParents(nodeParents[node]);
		}		
		return parents;
	}
	
	public static void changeParents (int changeNumber, int newNumber) {
		for(int i=0; i<nodeParents.length; i++) {
			if (nodeParents[i] == changeNumber) {
				nodeParents[i] = newNumber;
			}
		}
	}

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
//		int cityCount = Integer.parseInt(br.readLine());
		//String getString = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int node = Integer.parseInt(st.nextToken());		
		int mainLine = Integer.parseInt(st.nextToken());	
		int cost = 0;
		nodeParents = new int[node];
		for (int i= 0; i<node; i++) {
			nodeParents[i] = i;
		}
		
		int[][] line = new int [mainLine][3];
		for (int i = 0; i < mainLine; i++) {
			st = new StringTokenizer(br.readLine());
			line[i][0] = Integer.parseInt(st.nextToken())-1;
			line[i][1] = Integer.parseInt(st.nextToken())-1;
			line[i][2] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(line, Comparator.comparing(o1 -> o1[2]));
		
		for(int i=0; i<line.length; i++) {
			if( findParents(line[i][0]) == findParents(line[i][1]) ) {
				continue;
			} else {
				cost += line[i][2];
				if (line[i][0]>line[i][1]) {
					changeParents(findParents(line[i][0]),findParents(line[i][1]));
				} else {
					changeParents(findParents(line[i][1]),findParents(line[i][0]));
				}				
			}
		}
		
		
		sb.append(cost);
		bw.write(sb.toString());
		bw.flush();		
	}	
}
