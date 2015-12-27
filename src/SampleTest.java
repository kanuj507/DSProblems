import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SampleTest{

	static int B;
	static int H;
	static boolean flag;
 static{
    Scanner s=new Scanner(System.in);
   B=s.nextInt();
     H=s.nextInt();
     
    if((B<0) ||(H<0))
       {
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           flag=false;
       }
    else
    {flag=true;}
}
	
	public static void main (String g[]) throws IOException
	{
		
	long c	=-(int) Math.pow(2, 31);
       // long x=sc.nextLong();
		long x=0;
        System.out.println(x+" can be fitted in:");
        if(x>=-128 && x<=127)System.out.println("* byte");
        else if(x>=-32768 && x<=32767)System.out.println("* short");
            else if ((x>=-(int) Math.pow(2, 31)) && (x<=(int) Math.pow(2, 31)-1)){System.out.println("* int");}
            else {System.out.println("* long");
            }
		
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		//int x=reader.read();
        //Complete this code
        double y=reader.read();
		 int a=(int) Math.pow(2, 30);
		 if(a>(int) Math.pow(2, 30))
		 {
			 
		 }
		String name = reader.readLine();
		System.out.println("Your name is: " + name);
		System.out.println("Your name is: " + x);
		System.out.println("Your name is: " + y);
		/*if(flag){
			int area=B*H;
			System.out.print(area);
		}
		*/
		
/*		
		
		
		 Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         //Complete this code
   
      Scanner sc3=new Scanner(System.in);
     double y=sc3.nextDouble();
       Scanner sc2=new Scanner(System.in);
     String s=sc2.nextLine();
         System.out.println("String: "+s);
         System.out.println("Double: "+y);
         System.out.println("Int: "+x);
        
			        System.out.println("Print new");
			        
			        Scanner in = new Scanner(System.in);
			        int noOfElement;
			        noOfElement = in.nextInt();
			        System.out.println(""+noOfElement);
			        Scanner a_in = new Scanner(System.in);
			     //   double[] array= new double[noOfElement];
			       for(int i=0;i<noOfElement;i++)
			           {
			            array[i]=a_in.nextInt();
			         //   System.out.print(" "+array[i]);
			           }
			       
			       String readLine = a_in.nextLine();
			        String[] weights = readLine.split(" ");
			        double[] array= new double[noOfElement];
			        for (int i = 0; i < noOfElement; i++) {
			        	array[i] = Integer.parseInt(weights[i]);
			        }
			        
			            a_in.close();
			       
			       for(int i=0;i<noOfElement;i++)
		           {
			    	   System.out.print(" "+array[i]);
		           }
			        double  div;        
			        int count=0;
			        int ElementofArray=noOfElement;
			        while(ElementofArray>0)
			            {
			        	 
			            if (array[count]>0)
			                {
			                div = array[count]/noOfElement;
			                System.out.println(div);
			               }
			            count++;
		                ElementofArray--;
			        }
			        ElementofArray=noOfElement;
			        count=0;
			         while(ElementofArray>0)
			            {
			            if (array[count]<0)
			                {
			                div = array[count]/noOfElement;
			                System.out.println(div);
			              }
			            count++;
		                ElementofArray--;
			        }
			       int iteratore=noOfElement-count+1;
			        while(iteratore>0)
			        System.out.println(0.0000);
			    */
	}
}