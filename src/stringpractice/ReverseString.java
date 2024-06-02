package stringpractice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseString {

    static String reverse_word(String s){

        char[] ch_ar1=s.toCharArray();
        String reverse="";
        for(int i=ch_ar1.length-1;i>=0;i--)
        {
            reverse+=ch_ar1[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s="hello world";
        String[] str_arr=s.split(" ");
        String result="";
        for(String s1:str_arr){
            result+=reverse_word(s1)+ " ";
        }
        System.out.println("Reversed String : "+result.trim());
    }
}