import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int countNumber = Integer.parseInt(br.readLine());		
		//String getString = br.readLine();
		
		int multitap = 0;
		ArrayList<String> multitapList = new ArrayList<String>();
		int useNumber = 0;
		String[] useList;
		int changeCount = 0;
		String removeName = "";
		int removeCount = 0;
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		multitap = Integer.parseInt(st.nextToken());		
		useNumber = Integer.parseInt(st.nextToken());			
		
		useList = new String[useNumber];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<useNumber; i++) {
			useList[i] = st.nextToken();
		}
				
		for(int i=0; i<useNumber; i++) {
			if(multitapList.contains(useList[i])) {
				continue;
			}
			if(multitapList.size()<multitap) {
				multitapList.add(useList[i]);
				continue;
			}					

			removeName = multitapList.get(0);
			removeCount = 0;
			for(int j=0; j<multitap; j++) {				
				for(int k=i; k<useNumber; k++) {						
					if ( useList[k].equals(multitapList.get(j).toString()) )
					{
						if(k>removeCount) {
							removeName = multitapList.get(j);
							removeCount = k;							
						}	
						break;
					}
					if (useNumber-1 == k) {
						removeName = multitapList.get(j);
						removeCount = Integer.MAX_VALUE;
					}
				}
				if (removeCount == Integer.MAX_VALUE) {
					break;
				}
			}
			
			if(multitapList.remove(removeName)) {
				multitapList.add(useList[i]);
				changeCount++;
			}		
			
		}
		
		sb.append(String.valueOf(changeCount));
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
