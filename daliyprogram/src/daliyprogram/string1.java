package daliyprogram;
import java.util.Scanner;
public class string1 {
	enum Level{LOW,MEDIUM,HIGH};

	public string1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String Str="malayalam";
		String reversestr="";
		for(int i=Str.length()-1;i>=0;i--);
		{int i=0;
			reversestr +=Str.charAt(i);
			
		}
		
         if(Str.equals(reversestr));
         {
        	 System.out.println("this is palindrome string"+Str);        	 
        	 
         }
         
	}

}
