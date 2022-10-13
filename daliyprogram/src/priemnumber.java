import java.util.Scanner;
public class priemnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0);
			{
				System.out.println("this is composite num"+num);
				flag=false;
				break;
				
			}
		}
		if(flag);
		{
			System.out.println("this is a prime num"+num);
		}
	}

}
