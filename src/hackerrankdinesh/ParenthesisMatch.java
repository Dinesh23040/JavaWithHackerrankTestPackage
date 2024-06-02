package hackerrankdinesh;


import java.util.*;

/*

{}()
({()})
{}(
[]



*/
class ParenthesisMatch{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
        boolean isBalance=false;
		while (sc.hasNext()) {
			String input=sc.next();
            isBalance=isBalanced_first(input);   
            if(isBalance)
        {
            System.out.println("true");
        }
        else
        {
        System.out.println("false");
        
                }        
                    
		}        
        
	}
    
    public static boolean isBalanced_first(String input){
        
        char[] ch=input.toCharArray();
        
        int array_length=ch.length;
        
        boolean result=false;
        
        if(array_length==0){
            result=true;
        }
        if(array_length%2==0){
            
            for(int i=0,j=array_length-1;i<array_length-1 && j>=0;i++,j--){
                if((ch[i]=='{' && ch[i+1]=='}') || (ch[i]=='(' && ch[i+1]==')') || (ch[i]=='[' && ch[i+1]==']')){
                    result=true;
                }else if((ch[i]=='{' && ch[array_length-1]=='}') || (ch[i]=='(' && ch[array_length-1]==')') || (ch[i]=='[' && ch[array_length-1]==']')){
                    result=true;
                }
            }
            
        }else{
            result=false;
        }
        
        return result;
    }   
       
    
    
}





// same program implemented using parenthesis
/*
To implement the program using a stack, we can follow these steps:

1. Create a stack to store opening brackets.
2. Iterate through each character in the input string.
3. If the character is an opening bracket (`'{'`, `'('`, or `'['`), push it onto the stack.
4. If the character is a closing bracket (`'}'`, `')'`, or `']'`), check if the stack is empty. If it is, return false because there is no corresponding opening bracket for the current closing bracket.
5. If the stack is not empty, pop the top element from the stack and check if it matches the corresponding opening bracket for the current closing bracket. If it doesn't match, return false.
6. After iterating through all characters, if the stack is empty, return true (indicating the string is balanced), otherwise return false.

Here's the implementation:

```java
import java.util.*;

class Solution {
    
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            boolean isBalance = isBalanced(input);
            System.out.println(isBalance);
        }        
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
```

This implementation uses a stack to keep track of opening brackets encountered in the input string. It checks whether each closing bracket matches the corresponding opening bracket popped from the stack. If at any point, a mismatch is found or the stack is empty when encountering a closing bracket, it returns false. Otherwise, if the stack is empty after processing all characters, it returns true, indicating the string is balanced.

*/