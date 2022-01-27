import java.io.*;
import java.util.*;
 
public class Main {

	static int maxWordCount = 0;
	static int getAlphabetCount;
	static int getWordCount;
	static String word[];
	static boolean alphabetCheck[] = new boolean[26];	
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int countNumber = Integer.parseInt(br.readLine());		
		//String getString = br.readLine();
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		getWordCount = Integer.parseInt(st.nextToken());		
		getAlphabetCount = Integer.parseInt(st.nextToken());			
		
		word = new String[getWordCount]; 
		for (int i=0;i<getWordCount;i++) {
			word[i] = br.readLine();
			word[i] = word[i].substring(4,word[i].length()-4);
		}
		
		if (getAlphabetCount < 5) {
			bw.write("0");
			bw.flush();		
			return;
		} else if (getAlphabetCount > 25) {			
			bw.write(String.valueOf(getWordCount));
			bw.flush();		
			return;
		}
		
		Arrays.fill(alphabetCheck,false);
		alphabetCheck['a'-97] = true;
		alphabetCheck['n'-97] = true;
		alphabetCheck['t'-97] = true;
		alphabetCheck['i'-97] = true;
		alphabetCheck['c'-97] = true;
		
		dfs(0,0);
		
		sb.append(String.valueOf(maxWordCount));
		bw.write(sb.toString());
		bw.flush();			
	}
	
	public static void dfs (int alphabetLocation, int learnAlphabetCount) {
		int passWordCount = 0;
		boolean passWord = false;
		
		if(learnAlphabetCount == getAlphabetCount-5) {
			for (int i=0; i<getWordCount;i++) {
				passWord = true;
				for (int j=0; j<word[i].length(); j++) {
					if (!alphabetCheck[word[i].charAt(j)-97]) {
						passWord = false;
						break;
					}
				}
				if(passWord) {
					passWordCount++;
				}
			}
			if (maxWordCount < passWordCount) {
				maxWordCount = passWordCount;
			}
		}
		
		for(int i=alphabetLocation; i<26; i++) {
			if (alphabetCheck[i] == true) {
				continue;
			}
			if (learnAlphabetCount > getAlphabetCount-5) {
				break;
			}
			alphabetCheck[i] = true;
			dfs(i,learnAlphabetCount+1);
			alphabetCheck[i] = false;
		}
		
	}
 
}
