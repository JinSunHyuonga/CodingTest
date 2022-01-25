import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		//int countNumber = Integer.parseInt(br.readLine());		
		String getString = br.readLine();
				
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int number = Integer.parseInt(st.nextToken());		
		//int number2 = Integer.parseInt(st.nextToken());		

		Stack<String> stack = new Stack<>();
		int resultNumber = 0;
		int sumNumber = 0;
		boolean keepParentheses = false;
		
		for(int i=0;i<getString.length();i++)
		{		
			if (getString.charAt(i) == '(') {				
				stack.push("(");
			} else if (getString.charAt(i) == ')') {				
				if (stack.empty()) {
					bw.write("0");
					bw.flush();	
					return;
				}	
				keepParentheses = true;
				while(!stack.empty() && keepParentheses) {
					if (stack.peek().equals("[")) {
						bw.write("0");
						bw.flush();		
						return;
					}					
					if (stack.peek().equals("(")) {
						if (sumNumber == 0) {
							sumNumber = 2;
							keepParentheses = false;
						} else {
							sumNumber *= 2;
							keepParentheses = false;
						}						
					} else {
						sumNumber += Integer.parseInt(stack.pop());
					}					
				}
				if (keepParentheses == true) {
					bw.write("0");
					bw.flush();	
					return;
				}
				stack.pop();
				stack.push(String.valueOf(sumNumber));
				sumNumber = 0;

			} else if (getString.charAt(i) == '[') {
				stack.push("[");
			} else if (getString.charAt(i) == ']') {				
				if (stack.empty()) {
					bw.write("0");
					bw.flush();	
					return;
				}
				keepParentheses = true;
				while(!stack.empty() && keepParentheses) {
					if (stack.peek().equals("(")) {
						bw.write("0");
						bw.flush();	
						return;
					}					
					if (stack.peek().equals("[")) {
						if (sumNumber == 0) {
							sumNumber = 3;
							keepParentheses = false;
						} else {
							sumNumber *= 3;
							keepParentheses = false;
						}						
					} else {
						sumNumber += Integer.parseInt(stack.pop());
					}					
				}
				if (keepParentheses == true) {
					bw.write("0");
					bw.flush();	
					return;
				}
				stack.pop();
				stack.push(String.valueOf(sumNumber));		
				sumNumber = 0;
			}					
		}

		while(!stack.empty()) {
			if (stack.peek().equals("[") || stack.peek().equals("(") ) {
				bw.write("0");
				bw.flush();	
				return;
			}
			resultNumber += Integer.parseInt(stack.pop());							
		}		
		
		sb.append(String.valueOf(resultNumber));
		bw.write(sb.toString());
		bw.flush();			
	}
 
}
