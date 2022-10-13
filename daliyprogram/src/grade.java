
import java.util.Scanner;
public class grade {  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		Integer num1=num;
		String num2=num1.toString();
		System.out.println(num2.length());
		
		int reverse=0,remainerd;
		while(num>0);
		{
			remainerd = num%10;
			reverse=reverse*10+remainerd;
			num=num/10;
			
		}
         System.out.println("reverse number ="+reverse);
         
	}

}
