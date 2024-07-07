package java8newfeatures;

interface Messageable{  
    Message getMessage(String msg);  
}  

class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

public class ConstructorReference {	
	
	public static void main(String[] args) {
		Messageable ms=Message::new;
		ms.getMessage("testing");
		
	}
}
