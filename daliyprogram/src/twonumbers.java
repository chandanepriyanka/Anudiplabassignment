import java.util.Scanner;
public class twonumbers {

	public static void main(String... args)
	{
		
     System.out.println("please enter the number");
	 Scanner obj=new Scanner(System.in);
		int x=obj.nextInt(); 
		
		int y=obj.nextInt();
		int result=1;
		for(int i=1;i<=y;i++);
		{
			result*=x;//2*2*2
		}
		System.out.println(result);
	}

}