package techgig.quiz;

public class EncodedMessage {

	
	public static void main(String[] args) {
		
		System.out.println(encode("{a s dffg}",3));
		System.out.println(decode("{d v giij}",3));
		//System.out.println((int)'a'+":"+(int)'z'+":"+(int)'A'+":"+(int)'Z');

	}
	
	public static String encode(String message,int key){
		String encodedMessage="";
		message=message.substring(1,message.length()-1);
		for(int i=0;i<message.length();i++){
			char currChar = message.charAt(i);
			if((currChar>=65 && currChar<=90)||(currChar>=97 && currChar<=122)){
				encodedMessage+=(char)((((currChar>=97)?(currChar-97):(currChar-65))+key)%26+97);
			}else{
				encodedMessage+=currChar;
			}
		}
		return "{"+encodedMessage+"}";
	}
	
	public static String decode_encode(String input1,int input2)
    {
        String decodedMessage="";
		for(int i=0;i<input1.length();i++){
			int charval = input1.charAt(i)-97-input2;
			while(charval<0){
				charval+=26;
			}
			decodedMessage+=(char)(charval+97);
		}
		return decodedMessage;
    }
	
	public static String decode(String message,int key){
		String decodedMessage="";
		message=message.substring(1,message.length()-1);
		for(int i=0;i<message.length();i++){
			
			char currChar = message.charAt(i);
			if((currChar>=65 && currChar<=90)||(currChar>=97 && currChar<=122)){
				int charval = currChar-97-key;
				while(charval<0){
					charval+=26;
				}
				decodedMessage+=(char)(charval+97);
			}else{
				decodedMessage+=currChar;
			}
		}
		return "{"+decodedMessage+"}";
	}

}
