import java.util.*;

class Q3ReverseString{

	public static String reverse(String str){
		char res[] = new char [str.length()];
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()){
			stack.push(ch);
		}
		
		int i=0;
		while(!stack.isEmpty()){
			res[i] = stack.pop();
			i++;
		}
		return new String(res);
	}

	public static void main(String args [] ){
		String str1 = "hello";
		String str2 = "world";
		
		System.out.println(reverse(str1));
		
		System.out.println(reverse(str2));
		
		
	}
	
}