import java.util.Scanner;
public class group1 {

	public group1() {
		// TODO Auto-generated constructor stub12
		Scanner kj=new Scanner(System.in);

    	System.out.println("Please enter your roll number");
        int num = kj.nextInt();
        if(num%4==1)
        {
            System.out.println("Emeral group");
            
        } 
        else if (num%4==2)
        {
          
        	System.out.println("Ruby group");
        } 
        else if (num%4==3)
        {
           
        	System.out.println("pearl group");
        }
        else if (num%4==0)
        {
          
        	System.out.println("sapphire group");
        }
	}
}

	




	

