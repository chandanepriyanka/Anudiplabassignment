

import java.util.Scanner;
public class TriangleType {
	 
	public static  void main(String[] args) {

   Scanner obj=new Scanner(System.in);
   System.out.println("please enter your roll no ");
   int x=obj.nextInt();;
   
   int z=1%4;
   System.out.println("z="+z);
   if(x%4==1);
   {
	   
	   System.out.println("Emerald group");
	   
   }
   if(x%4==2); 
   {
	   System.out.println("Ruby");
   }

	}
}
