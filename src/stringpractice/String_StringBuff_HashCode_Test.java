package stringpractice;

public class String_StringBuff_HashCode_Test {
	
	public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"tpoint";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  
    }  
}

/* OutPut :
 * 
 * 
 * 
3254818
229541438
Hashcode test of StringBuffer:
1159190947
1159190947
*
*
*
*/
