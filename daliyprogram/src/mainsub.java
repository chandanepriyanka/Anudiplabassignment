

import java.util.Scanner;

public class mainsub {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Student role number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        if(n%4==1 || n==1)
        {
        	System.out.println("You are in Sapphire Group");
        }else if(n%4==2 || n==2)
        {
        	System.out.println("You are in Perl Group");
        }else if(n%4==3 || n==3)
        {
        	System.out.println("You are in Ruby Group");
        }else if(n%4==0)
        {
        	System.out.println("You are in Emerald Group");
        }
        
	}
	}