package daliyprogram;
import java.util.Scanner;
public class number4 {


		enum Level{LOW,MEDIUM,HIGH};
	       
		public static void main(String[] args) {
			
		System.out.println("enter the number");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		double result = 0.0,reciprocal=0.0;
		for(int i=1;i<num;i++);
		{
			int i=0;
			reciprocal=1/i ;//1+0.5+0.25+0.125
			System.out.println("reciprocal");
			result=result+reciprocal;
			
			
		}
				
		System.out.println("sum of series ="+result);
		
	
	}

	}
